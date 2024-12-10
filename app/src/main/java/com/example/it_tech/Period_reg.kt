package com.example.it_tech


import android.content.Intent
import android.os.Bundle

import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity
import java.time.LocalDate

import java.time.LocalDateTime
import java.time.Period


class PeriodReg : AppCompatActivity() {




    private lateinit var periodChoose: TextView

    private lateinit var firstperiod: Button
    private lateinit var secondperiod: Button
    private lateinit var thridperiod: Button

    private lateinit var next: Button

    var startPeriod = LocalDate.now()
    var period = Period.ZERO
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_period_reg)


        periodChoose = findViewById(R.id.topTextView)

        firstperiod = findViewById(R.id.akchii)
        secondperiod = findViewById(R.id.passwordEditTex)
        thridperiod = findViewById(R.id.passwordEdit)
        next = findViewById(R.id.loginButton)


        firstperiod.setOnClickListener {
            period = Period.of(0, 6,0)
        }

        secondperiod.setOnClickListener {
            period = Period.of(1, 0,0)
        }

        thridperiod.setOnClickListener{
            period = Period.of(2, 0,0)
        }

        next.setOnClickListener {

            val currentPeriod = startPeriod.plus(period)
            if (period == Period.ZERO)
            {
                Toast.makeText(this, "Период не выбран", Toast.LENGTH_LONG).show()
            }
            else
            {
                val intent = Intent(this, PeriodReg:: class.java)

                startActivity(intent)
            }

        }

    }
}