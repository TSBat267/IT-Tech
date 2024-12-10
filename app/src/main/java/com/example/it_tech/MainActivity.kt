package com.example.it_tech

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val userLogin: EditText = findViewById(R.id.nameEditText)//текстовоое поле для ввода логина
        val userEmail: EditText = findViewById(R.id.emailEditText)//текстовое поле для ввода почты
        val userPass: EditText = findViewById(R.id.passwordEditText)//тестовое поле для ввода пароля
        val userRelPass: EditText = findViewById(R.id.confirmPasswordEditText)
        val button: Button = findViewById(R.id.regButton)//кнопка регистрация
        val linkToAuth: TextView = findViewById(R.id.logButton)//надпись ссылка для перехода к странице входа

        linkToAuth.setOnClickListener {
            val intent = Intent(this, AuthActivity::class.java)
            startActivity(intent)
        }

        button.setOnClickListener{
            val login = userLogin.text.toString().trim()
            val email = userEmail.text.toString().trim()
            val pass = userPass.text.toString().trim()
            val relPass = userRelPass.text.toString().trim()

            if(login == "" || email == "" || pass == "" || relPass == "")
                Toast.makeText(this, "Не все поля заполнены", Toast.LENGTH_LONG).show()
            else if(pass != relPass)
                Toast.makeText(this, "Пароли не совпадают", Toast.LENGTH_LONG).show()
            else{
                val user = User(login, email, pass)

                val db = DbHelper(this, null)
                db.addUser(user)
                Toast.makeText(this, "Пользователь $login добавлен", Toast.LENGTH_LONG).show()
                linkToAuth.setOnClickListener {
                    val intent = Intent(this, AuthActivity::class.java)
                    startActivity(intent)
                }

                userLogin.text.clear()
                userEmail.text.clear()
                userPass.text.clear()
                userRelPass.text.clear()
            }
        }
    }
}