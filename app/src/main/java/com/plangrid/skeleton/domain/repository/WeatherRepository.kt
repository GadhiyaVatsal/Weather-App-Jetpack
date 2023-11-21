package com.plangrid.skeleton.domain.repository

import com.plangrid.skeleton.domain.util.Resource
import com.plangrid.skeleton.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}