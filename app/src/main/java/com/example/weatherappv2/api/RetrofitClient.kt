package com.example.weatherappv2.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    private const val baseUrl = "https://api.weatherbit.io/v2.0/";

    val retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val weatherApi : ApiService = retrofit.create(ApiService::class.java)
}