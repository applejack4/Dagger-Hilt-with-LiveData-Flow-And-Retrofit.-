package com.example.daggerhiltretrofit.Network

import com.example.daggerhiltretrofit.Model.Post
import retrofit2.http.GET

interface ApiService {
    @GET("posts")
    suspend fun getPost() : List<Post>
}