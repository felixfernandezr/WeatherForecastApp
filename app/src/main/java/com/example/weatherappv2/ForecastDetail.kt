package com.example.weatherappv2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.weatherappv2.adapter.forecastadapter.ForecastAdapter
import com.example.weatherappv2.databinding.ForecastDetailLayoutBinding
import com.example.weatherappv2.weathermodel.WeatherForecastModel

class ForecastDetail : AppCompatActivity() {

    private lateinit var binding: ForecastDetailLayoutBinding
    private lateinit var forecastAdapter: ForecastAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize ForecastDetail binding
        binding = ForecastDetailLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Retrieving data from MainActivity
        val weatherData = intent.getSerializableExtra("WEATHER_DATA") as? WeatherForecastModel

        // Initialize ForecastDetail RecyclerView and Adapter
        weatherData?.let {
            forecastAdapter = ForecastAdapter(it.data)
            binding.rvForecastDetail.layoutManager = LinearLayoutManager(this)
            binding.rvForecastDetail.adapter = forecastAdapter
        }

        // Set up back button to return to MainActivity
        val backButton: Button = binding.backBtn
        backButton.setOnClickListener {
            // Navigate back to MainActivity
            /*val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)*/
            finish() // Remove ForecastDetail from the back stack
        }
    }
}