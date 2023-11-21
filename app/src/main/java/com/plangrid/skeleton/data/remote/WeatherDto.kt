package com.plangrid.skeleton.data.remote

import com.fasterxml.jackson.annotation.JsonProperty


data class WeatherDto(
    @JsonProperty("hourly")
    val weatherData: WeatherDataDto
)
