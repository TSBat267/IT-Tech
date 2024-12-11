package com.example.it_tech

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ToolActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tool)//ссылка на файл xml

        val button_akchii: Button = findViewById(R.id.akchii)
        val button_bonds: Button = findViewById(R.id.obligachii)
        val button_value: Button = findViewById(R.id.value)
        val button_metal: Button = findViewById(R.id.metal)
        val button_wallet1: Button = findViewById(R.id.button_wallet1)
        val button_profile: Button = findViewById(R.id.button_prof)

        button_akchii.setOnClickListener{
            val intent = Intent(this, StockActivity::class.java)//страница с акциями
            startActivity(intent)
        }
        button_bonds.setOnClickListener{
            val intent = Intent(this, BondsActivity::class.java)//страница с облигациями
            startActivity(intent)
            finish()
        }
        button_value.setOnClickListener{
            val intent = Intent(this, ValueActivity::class.java)//страница с валютами
            startActivity(intent)
            finish()

        }
        button_metal.setOnClickListener{
            val intent = Intent(this, MetalActivity::class.java)//страница с металлами
            startActivity(intent)
            finish()

        }
        button_wallet1.setOnClickListener{
            val intent = Intent(this, WalletActivity::class.java)//страница с кошельком1
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