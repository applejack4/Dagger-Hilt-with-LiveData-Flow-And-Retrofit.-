package com.example.daggerhiltretrofit.Network

import com.example.daggerhiltretrofit.Model.Post
import javax.inject.Inject

class PostServiceImplementation @Inject constructor(private val apiService: ApiService) {

    suspend fun getPost() : List<Post> = apiService.getPost()

}