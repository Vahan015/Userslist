package com.example.userslist
import retrofit2.http.GET


    interface ApiService {
        @GET("users")
        suspend fun getUsers(): List<UserData>
    }


