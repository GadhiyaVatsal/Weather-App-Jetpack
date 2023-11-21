package com.plangrid.skeleton.data.remote

import com.fasterxml.jackson.annotation.JsonProperty


data class WeatherDataDto(
    val time: List<String>,
    @JsonProperty("temperature_2m")
    val temperatures: List<Double>,
    @JsonProperty("weathercode")
    val weatherCodes: List<Int>,
    @JsonProperty("pressure_msl")
    val pressures: List<Double>,
    @JsonProperty("windspeed_10m")
    val windSpeeds: List<Double>,
    @JsonProperty("relativehumidity_2m")
    val humidities: List<Double>
)