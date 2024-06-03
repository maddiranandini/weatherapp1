package com.example.weatherapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.ActionMode.Callback
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //4495052bfe3d4e4094c5c0c9afaddd86
        setContentView(R.layout.activity_main)
        fetchWeatherData()

        }

    private fun fetchWeatherData() {
       val retrofit = Retrofit.Builder()
           .addConverterFactory(GsonConverterFactory.create())
           .baseUrl("https://api.openweathermap.org/data/2.5/")
           .build().create(ApiInterface::class.java)
        val response = retrofit.getWeatherData(city: "jaipur", appid: "4495052bfe3d4e4094c5c0c9afaddd86",units: "metric")
        response.enqueue(object : Callback<WeatherApp>
        {

        })
    }
}
}