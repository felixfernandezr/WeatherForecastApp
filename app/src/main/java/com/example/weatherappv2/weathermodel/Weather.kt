package com.example.weatherappv2.weathermodel

import java.io.Serializable

data class Weather(
    val code: String,
    val description: String,
    val icon: String
) : Serializable