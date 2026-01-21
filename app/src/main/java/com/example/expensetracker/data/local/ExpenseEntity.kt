package com.example.expensetracker.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.expensetracker.model.Expense

@Entity(tableName = "expenses")
data class ExpenseEntity(
    @PrimaryKey val id: Long,
    val title: String,
    val amount: Double,
    val date: Long
)

fun ExpenseEntity.toDomain() = Expense(
    id = id,
    title = title,
    amount = amount,
    date = date
)

fun Expense.toEntity() = ExpenseEntity(
    id = id,
    title = title,
    amount = amount,
    date = date
)


