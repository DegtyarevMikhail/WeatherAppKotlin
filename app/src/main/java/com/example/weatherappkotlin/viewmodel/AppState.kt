package com.example.weatherappkotlin.viewmodel


import com.example.weatherappkotlin.model.WeatherInfo


sealed class AppState {
    data class Success(val weatherData:List<WeatherInfo>) : AppState()
    data class Error(val error : Throwable) : AppState()
    object Loading:AppState()
}
