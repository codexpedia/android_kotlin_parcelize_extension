package com.example.kotlinparcelizeextension.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Car(val color: String, val weight: Int, val make: Make): Parcelable