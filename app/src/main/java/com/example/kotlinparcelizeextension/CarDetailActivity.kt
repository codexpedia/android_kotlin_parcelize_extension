package com.example.kotlinparcelizeextension

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.kotlinparcelizeextension.MainActivity.Companion.CAR
import com.example.kotlinparcelizeextension.model.Car
import kotlinx.android.synthetic.main.activity_car_detail.*

class CarDetailActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car_detail)

        val car = intent.extras.getParcelable<Car>(CAR)

        tv_car_detail.text = car.toString()

    }


}


