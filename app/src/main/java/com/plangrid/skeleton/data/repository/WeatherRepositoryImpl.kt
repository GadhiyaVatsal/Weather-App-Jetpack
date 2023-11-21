package com.plangrid.skeleton.data.repository

import com.plangrid.skeleton.data.mappers.toWeatherInfo
import com.plangrid.skeleton.data.remote.WeatherApi
import com.plangrid.skeleton.domain.repository.WeatherRepository
import com.plangrid.skeleton.domain.util.Resource
import com.plangrid.skeleton.domain.weather.WeatherInfo
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
            Resource.Error(data = null,message = e.message ?: "An unknown error occurred.")
        }
    }
}