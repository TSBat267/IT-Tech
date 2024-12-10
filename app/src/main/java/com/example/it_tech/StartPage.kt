package com.example.it_tech

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class StartPage : AppCompatActivity() {

    private lateinit var helloUser: TextView

    private lateinit var startButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_page)


        helloUser = findViewById(R.id.Hello)
        startButton = findViewById(R.id.start_button)

        startButton.setOnClickListener {
            val intent = Intent(this, Cash_reg:: class.java)

            startActivity(intent)
        }

    }
}