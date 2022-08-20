package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Text Color
        findViewById<Button>(R.id. button).setOnClickListener {
            Log.i("Inder", "Button Clicked")
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.lightblue))
        }
        //Background color
        findViewById<Button>(R.id. button2).setOnClickListener {
            findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.backgroundView).setBackgroundColor(
                getResources().getColor(com.google.android.material.R.color.accent_material_light)
            )
        }
    }
}