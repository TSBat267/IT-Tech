package com.example.it_tech

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.time.Period


class Cash_reg : AppCompatActivity() {

    public var currentBalance: Int = 0

    private lateinit var cashChoose: TextView
    private lateinit var usercash: EditText


    private lateinit var firstcash: Button
    private lateinit var secondcash: Button
    private lateinit var thridcash: Button

    private lateinit var next: Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cash_reg)

        cashChoose = findViewById(R.id.topTextView)
        usercash = findViewById(R.id.balance)

        firstcash = findViewById(R.id.akchii)
        secondcash = findViewById(R.id.passwordEditTex)
        thridcash = findViewById(R.id.passwordEdit)
        next = findViewById(R.id.loginButton)

       currentBalance = (usercash.text.toString()).toInt()


        if (currentBalance == 0 )
        {
            Toast.makeText(this, "Вклад не выбран", Toast.LENGTH_LONG).show()
        }
        else
        {
            val intent = Intent(this, PeriodReg:: class.java)

            startActivity(intent)
        }


    }

}
