package com.example.expensetracker.navigation


sealed class Screen (val route: String) {
    object Login : Screen("login")
    object Expense: Screen("expense")
}