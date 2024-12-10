package com.example.it_tech

import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Cash_reg : AppCompatActivity() {

    public var currentBalance: Int = 0

    private lateinit var cashChoose: TextView
    private lateinit var usercash: EditText

    private lateinit var firstcash: Button
    private lateinit var secondcash: Button
    private lateinit var thridcash: Button

    private lateinit var next: Button


    //cashChoose = findViewById(R.id.cashChoose)
    //usercash = findViewById(R.id.usercash)

//    firstcash = findViewById(R.id.firstcash)
//    secondcash = findViewById(R.id.secondcash)
//    thridcash = findViewById(R.id.thridcash)
    //    next = findViewById(R.id.next)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cash_reg)

        firstcash.text = "500 000";
        secondcash.text = "1 000 000";
        thridcash.text = "2 000 000";

        val name = usercash.text.toString()

        firstcash.setOnClickListener {
            usercash.text = firstcash.text as Editable?
        }

        secondcash.setOnClickListener {
            usercash.text = secondcash.text as Editable?
        }

        thridcash.setOnClickListener{
            usercash.text = thridcash.text as Editable?
        }

        next.setOnClickListener{
            currentBalance = (usercash.text as String).toInt()
        }

    }

}

class 