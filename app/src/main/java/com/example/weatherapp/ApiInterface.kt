package com.example.weatherapp

import android.telecom.Call

interface ApiInterface {
    @GET("weather")
    fun getWeatherData(
        @Query("q") city:String,
        @Query("appid") appid :String,
        @Query("units") units:String
    ) : Call<WeatherApp>
}