package com.example.expensetracker.ui.expense

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.expensetracker.model.Expense

@Composable
fun ExpenseList(
    items: List<Expense>,
    onDelete: (Long) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier.fillMaxSize()
    ) {
        items(
            items = items,
            key = { it.id }
        ){ expense ->
            ExpenseItem(
                expense = expense,
                onDelete = { onDelete(expense.id) }
            )
        }
    }
}