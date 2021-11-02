package com.example.daggerhiltretrofit.di

import com.example.daggerhiltretrofit.Network.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    fun providesBaseUrl() : String = "https://jsonplaceholder.typicode.com/"

    @Provides
    @Singleton
    fun providesRetrofitBuilder(baseurl : String) : Retrofit
            = Retrofit.Builder()
            .baseUrl(baseurl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    @Provides
    @Singleton
    fun providePostApiService(retrofit: Retrofit) : ApiService = retrofit.create(ApiService::class.java)
}