package com.example.userslist

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.material.Text
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun UserListScreen(userViewModel: UserViewModel = viewModel()) {
    val users = userViewModel.users.collectAsState(initial = listOf())

    LazyColumn {
        items(users.value) { user ->
            Text(text = "${user.name} (${user.username})")
        }
    }
}
