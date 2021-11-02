package com.example.daggerhiltretrofit.Repository

import com.example.daggerhiltretrofit.Model.Post
import com.example.daggerhiltretrofit.Network.PostServiceImplementation
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class PostRepository @Inject constructor(private val postServiceImplementation: PostServiceImplementation) {
    fun getPost() : Flow<List<Post>> = flow {
        val response = postServiceImplementation.getPost()
        emit(response)
    }.flowOn(Dispatchers.IO)
}