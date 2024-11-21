package com.example.weatherappv2.weathermodel

import java.io.Serializable

data class WeatherForecastModel(
    val city_name: String,
    val country_code: String,
    val `data`: List<Data>,
    val lat: String,
    val lon: String,
    val state_code: String,
    val timezone: String
) : Serializable