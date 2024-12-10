package com.example.it_tech

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity(){
    override fun  onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        var userName: TextView = findViewById(R.id.textUserName)
        val db = DbHelper(this, null)
        userName = (intent.getStringExtra("EXTRA_USER_LOGIN") ?: "default_login") as TextView

        val button: ImageButton = findViewById(R.id.buttonExit)

        button.setOnClickListener {
            val intent = Intent(this, StartPage::class.java)
            startActivity(intent)
        }
    }
}