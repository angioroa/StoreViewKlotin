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
        val myErrorText = findViewById<TextView>(R.id.textError)
        if (myTextEmail.text.toString() == "" || myPassText.text.toString() == "") {
            myErrorText.visibility = View.VISIBLE

        }
        else {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
