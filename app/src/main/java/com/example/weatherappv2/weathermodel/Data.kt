package com.example.weatherappv2.weathermodel

import java.io.Serializable

data class Data(
    val app_max_temp: String,
    val app_min_temp: String,
    val clouds: String,
    val clouds_hi: String,
    val clouds_low: String,
    val clouds_mid: String,
    val datetime: String,
    val dewpt: String,
    val high_temp: String,
    val low_temp: String,
    val max_dhi: String,
    val max_temp: String,
    val min_temp: String,
    val moon_phase: String,
    val moon_phase_lunation: String,
    val moonrise_ts: String,
    val moonset_ts: String,
    val pop: String,
    val precip: String,
    val pres: String,
    val rh: String,
    val slp: String,
    val snow: String,
    val snow_depth: String,
    val sunrise_ts: String,
    val sunset_ts: String,
    val temp: String,
    val ts: String,
    val uv: String,
    val valid_date: String,
    val vis: String,
    val weather: Weather,
    val wind_cdir: String,
    val wind_cdir_full: String,
    val wind_dir: String,
    val wind_gust_spd: String,
    val wind_spd: Double,
)  : Serializable
{
    val windSpeedKmH: String
        get() = String.format("%.2f", wind_spd * 3.6)
}