package com.example.kotlinparcelizeextension

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import com.example.kotlinparcelizeextension.model.Car
import com.example.kotlinparcelizeextension.model.Make

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        val CAR = "car"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val car = Car(
            color = "Yellow",
            weight = 3900,
            make = Make("Ford", "USA")
        )

        btn_car_detail.setOnClickListener {
            val intent = Intent(this, CarDetailActivity::class.java)
            intent.putExtra(CAR, car)
            startActivity(intent)
        }
    }


}
