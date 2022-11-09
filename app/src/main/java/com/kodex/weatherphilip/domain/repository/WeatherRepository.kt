package com.kodex.weatherphilip.domain.repository

import com.kodex.weatherphilip.domain.util.Resource
import com.kodex.weatherphilip.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>

}