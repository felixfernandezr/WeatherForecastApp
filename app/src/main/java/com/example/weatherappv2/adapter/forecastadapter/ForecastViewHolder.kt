package com.example.weatherappv2.adapter.forecastadapter

import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherappv2.databinding.ItemForecastDetailBinding
import com.example.weatherappv2.weathermodel.Data

class ForecastViewHolder (private val binding: ItemForecastDetailBinding) : RecyclerView.ViewHolder(binding.root) {

    fun render(forecast: Data) {
        Log.d("DataFromRender", "Data from render function")

        binding.tvDate.text = forecast.valid_date
        binding.tvCondition.text = forecast.weather.description
        binding.tvMin.text = "${forecast.min_temp}°C"
        binding.tvMax.text = "${forecast.max_temp}°C"
    }
}