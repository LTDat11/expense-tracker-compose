package com.example.expensetracker.ui.login

data class LoginUiState(
    val isLoading: Boolean = false,
    val username: String = "",
    val password: String = "",
    val isSuccess: Boolean = false,
    val error: String? = null
)