package com.aether.mymovieappmvp.data.model

import com.aether.mymovieappmvp.utilities.Constants
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET
import retrofit2.http.Query

interface WebService {
    @GET("movie/top_rated")
    suspend fun getMovies(@Query("api_key") apiKey:String):MovieList
}

object RetrofitClient {
    val webservice by lazy {
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build().create(WebService::class.java)
    }
}