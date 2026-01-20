package com.example.expensetracker.navigation

import android.transition.Scene

sealed class Screen (val route: String) {
    object Login : Screen("login")
    object Expense: Screen("expense")
}