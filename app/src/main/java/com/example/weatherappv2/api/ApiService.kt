package com.example.weatherappv2.api

import com.example.weatherappv2.weathermodel.WeatherForecastModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("forecast/daily")
    suspend fun getWeather(
        @Query("key") apiKey: String,
        @Query("lang") language:String,
        @Query("units") unit:String,
        @Query("city") city:String,
        @Query("days") days:String
    ): Response<WeatherForecastModel>
}