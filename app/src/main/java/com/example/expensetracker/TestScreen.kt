package com.example.expensetracker

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel

@Composable
fun TestScreen (
    viewModel: TestViewModel = hiltViewModel()
) {
    Text("Hilt ViewModel OK")
}