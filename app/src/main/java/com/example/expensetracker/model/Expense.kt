package com.example.expensetracker.model

data class Expense(
    val id: Long,
    val title: String,
    val amount: Double,
    val date: Long
)
