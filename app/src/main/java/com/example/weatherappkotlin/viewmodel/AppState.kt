package com.example.weatherappkotlin.viewmodel

import com.example.weatherappkotlin.model.Weather


sealed class AppState {
    data class Success(val weatherData: Weather) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}
