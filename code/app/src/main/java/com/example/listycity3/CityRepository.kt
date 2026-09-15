package com.example.listycity3
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

class CityRepository {
    private val _cities = mutableStateListOf(
        City("Edmonton", "AB"),
        City("Vancouver", "BC"),
        City("Toronto", "ON")
    )
    fun addCity(city: City) {
        _cities.add(city)
    }

    fun updateCity(oldCity: City?, updatedCity: City?) {
        val index = _cities.indexOf(oldCity)
        if (index != -1) {
            if (updatedCity != null) {
                _cities[index] = updatedCity
            }

        }
    }
    val cities: List<City>
        get() = _cities
}