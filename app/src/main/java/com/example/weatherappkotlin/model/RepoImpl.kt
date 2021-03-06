package com.example.weatherappkotlin.model

class RepoImpl : Repo {
    override fun getWeatherFromServer(): WeatherInfo {
        return WeatherInfo()
    }

    override fun getWeatherFromLocalStorageRus(): List<WeatherInfo> {
        return getRussianCities()
    }

    override fun getWeatherFromLocalStorageWorld(): List<WeatherInfo> {
        return getWorldCities()
    }
}