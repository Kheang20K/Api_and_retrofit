package com.example.learnapiretrofit


import MyDataItem
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("posts")
    fun getData(): Call<List<MyDataItem>>
}