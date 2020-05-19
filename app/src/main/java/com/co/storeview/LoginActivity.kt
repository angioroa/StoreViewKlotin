package com.co.storeview

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.view.View


class LoginActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun logIn(view: View) {
        val myTextEmail = findViewById<EditText>(R.id.textEmail)
        val myPassText = findViewById<EditText>(R.id.passText)

        if (myTextEmail.text.toString() == "" || myPassText.text.toString() == "") {

        }
        else {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    fun register(view:View){
        val intent = Intent(this, RegisterUserActivity::class.java)
        startActivity(intent)
    }
}
