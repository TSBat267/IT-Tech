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
        setContentView(R.layout.activity_start)


        helloUser = findViewById(R.id.topTextView)
        startButton = findViewById(R.id.start_button)

        startButton.setOnClickListener {
            val intent = Intent(this, Cash_regg:: class.java)

            startActivity(intent)
        }

    }
}