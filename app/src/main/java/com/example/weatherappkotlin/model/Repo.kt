package com.example.weatherappkotlin.model

interface Repo {
    fun getWeatherFromServer(): WeatherInfo
    fun getWeatherFromLocalStorageRus(): List<WeatherInfo>
    fun getWeatherFromLocalStorageWorld(): List<WeatherInfo>
}