package com.example.userslist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import kotlinx.coroutines.Dispatchers

class UserViewModel(private val apiService: ApiService) : ViewModel() {
    val users = liveData(context = Dispatchers.IO) {
        emit(apiService.getUsers())
    }
}
