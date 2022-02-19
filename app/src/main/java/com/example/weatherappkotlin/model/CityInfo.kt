package com.example.weatherappkotlin.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class CityInfo (
    val city: String,
    val lat: Double,
    val lon: Double
) : Parcelable


