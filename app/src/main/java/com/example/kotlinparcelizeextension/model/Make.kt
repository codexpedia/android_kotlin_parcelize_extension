package com.example.kotlinparcelizeextension.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Make(val name: String, val country: String): Parcelable