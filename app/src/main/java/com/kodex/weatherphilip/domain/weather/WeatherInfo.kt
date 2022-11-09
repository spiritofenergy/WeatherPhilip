package com.kodex.weatherphilip.domain.weather

import com.kodex.weatherphilip.data.remote.WeatherDto
import java.time.MonthDay

data class WeatherInfo(
     val weatherDataPerDay: Map<Int, List<WeatherData>>,
     val currentWeatherData: WeatherData?
)