package com.example.weatherappv2.adapter.currentadapter

import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherappv2.databinding.ItemActivityMainBinding
import com.example.weatherappv2.weathermodel.WeatherForecastModel

class CurrentWeatherViewHolder(private val binding: ItemActivityMainBinding) : RecyclerView.ViewHolder(binding.root) {

    fun render(currentWeather: WeatherForecastModel) {
        Log.d("FromViewHolderData", "Data from view holder: $currentWeather")

        binding.tvLocation.text = "${currentWeather.city_name}, ${currentWeather.timezone}"
        binding.tvTemp.text = "${currentWeather.data[0].temp}°C"
        binding.tvCondition.text = currentWeather.data[0].weather.description
        binding.tvHumidity.text = "Precipitation: ${currentWeather.data[0].precip}%"
        binding.tvWind.text = "Wind: ${currentWeather.data[0].windSpeedKmH} km/h"
    }


}