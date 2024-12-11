package com.example.it_tech

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    private lateinit var textUserName: TextView
    private lateinit var buttonExit: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        textUserName = findViewById(R.id.textUserName)
        buttonExit = findViewById(R.id.button_exit)

        val userLogin = intent.getStringExtra("EXTRA_USER_LOGIN")
        textUserName.text = userLogin ?: "Гость"

        buttonExit.setOnClickListener {
            finish()
        }
    }
}