package com.example.it_tech

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.Lifecycle

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanseState: Bundle?) {
        super.onCreate(savedInstanseState)
        setContentView(R.layout.)//ссылка на файл xml

        val userLogin: EditText =
            findViewById(R.id.)//текстовоое поле для ввода логина для аунтификации
        val userPass: EditText =
            findViewById(R.id.)//тестовое поле для ввода пароля для аунтификации
        val button: Button = findViewById(R.id.)//кнопка входа для аунтификации
        val linkToReg: TextView =
            findViewById(R.id.)//надпись войти, котора переносит на страницу регистрации

        linkToReg.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        button.setOnClickListener {
            val login = userLogin.text.toString().trim()
            val pass = userPass.text.toString().trim()

            if (login == "" || pass == "")
                Toast.makeText(this, "Не все поля заполнены", Toast.LENGTH_LONG).show()
            else {
                val db = DbHelper(this, null)
                val isAuth = db.getUser(login, pass)

                if (isAuth) {
                    Toast.makeText(this, "Пользователь $login авторизован", Toast.LENGTH_LONG)
                        .show()
                    userLogin.text.clear()
                    userPass.text.clear()
                    //val intent = Intent(this, /*название страницы, на которую мы переходим*/::class.java)
                    //startActivity(intent)
                } else Toast.makeText(this, "Пользователь $login НЕ авторизован", Toast.LENGTH_LONG)
                    .show()
            }
        }
    }
}