package com.example.assign1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1= findViewById<Button>(R.id.button)
        button1.setOnClickListener {
            intent= Intent(applicationContext,act2::class.java)
            startActivity(intent)
        }
    }
}