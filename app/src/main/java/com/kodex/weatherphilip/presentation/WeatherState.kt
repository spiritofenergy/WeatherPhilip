package com.kodex.weatherphilip.presentation

import com.kodex.weatherphilip.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
