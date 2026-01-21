package com.example.expensetracker.ui.expense

import com.example.expensetracker.model.Expense

data class ExpenseUiState(
    val isLoading: Boolean = false,
    val expenses: List<Expense> = emptyList(),
    val error: String? = null
)
