package com.example.it_tech

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class WalletActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wallet)//ссылка на файл xml {

        val button_profile: Button = findViewById(R.id.button_prof)
        val button_tool: Button = findViewById(R.id.button_investment_tools2)

        button_profile.setOnClickListener{
            val intent = Intent(this, ProfileActivity::class.java)//ссылка на профиль
            startActivity(intent)
            finish()
        }
        button_tool.setOnClickListener{
            val intent = Intent(this, ToolActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}