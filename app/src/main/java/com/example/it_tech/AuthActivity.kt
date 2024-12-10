package com.example.it_tech

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AuthActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)//ссылка на файл xml

        val userLogin: EditText = findViewById(R.id.nameEditText)//текстовоое поле для ввода логина для аунтификации
        val userPass: EditText = findViewById(R.id.passwordEditText)//тестовое поле для ввода пароля для аунтификации
        val button: Button = findViewById(R.id.authButton)//кнопка входа
        val linkToReg: TextView = findViewById(R.id.loginButton)//надпись войти, котора переносит на страницу регистрации

            linkToReg.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        button.setOnClickListener{
            val login = userLogin.text.toString().trim()
            val pass = userPass.text.toString().trim()

            if(login == "" || pass == "")
                Toast.makeText(this, "Не все поля заполнены", Toast.LENGTH_LONG).show()
            else{
                val db = DbHelper(this, null)
                val isAuth = db.getUser(login, pass)

                if(isAuth) {
                    Toast.makeText(this, "Пользователь $login авторизован", Toast.LENGTH_LONG).show()
                    userLogin.text.clear()
                    userPass.text.clear()
                    //val intent = Intent(this, /*название страницы, на которую мы переходим*/::class.java)
                    //startActivity(intent)
                }
                else Toast.makeText(this, "Пользователь $login НЕ авторизован", Toast.LENGTH_LONG).show()
            }
        }
    }
}