package com.example.expensetracker.data.repository

import com.example.expensetracker.data.local.ExpenseDao
import com.example.expensetracker.data.local.toDomain
import com.example.expensetracker.data.local.toEntity
import com.example.expensetracker.model.Expense
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ExpenseRepositoryImpl @Inject constructor(
    private val expenseDao: ExpenseDao
) : ExpenseRepository {
    override fun observeExpenses(): Flow<List<Expense>> = expenseDao.getExpenses().map { list ->
        list.map { it.toDomain() }
    }

    override suspend fun addExpense(expense: Expense) {
        expenseDao.insert(expense.toEntity())
    }

    override suspend fun deleteExpense(id: Long) {
        expenseDao.delete(id)
    }
}