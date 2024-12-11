package com.example.it_tech

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MetalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_metal)//ссылка на файл xml

        val button_tool: Button = findViewById(R.id.button_investment_tools)
        val button_wall: Button = findViewById(R.id.button_wallet)
        val button_profile: Button = findViewById(R.id.button_prof)

        button_tool.setOnClickListener{
            val intent = Intent(this, ToolActivity::class.java)//страница с инструментами
            startActivity(intent)
            finish()

        }
        button_wall.setOnClickListener{
            val intent = Intent(this, WalletActivity::class.java)//страница с кошельком
            startActivity(intent)
            finish()

        }
        button_profile.setOnClickListener{
            val intent = Intent(this, ProfileActivity::class.java)//страница с профилем
            startActivity(intent)
            finish()
        }
    }
}