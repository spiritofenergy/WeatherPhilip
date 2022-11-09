package com.kodex.weatherphilip.data.repository

import com.kodex.weatherphilip.data.mappers.toWeatherInfo
import com.kodex.weatherphilip.data.remote.WeatherApi
import com.kodex.weatherphilip.domain.repository.WeatherRepository
import com.kodex.weatherphilip.domain.util.Resource
import com.kodex.weatherphilip.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
): WeatherRepository {

    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        } catch(e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }
}