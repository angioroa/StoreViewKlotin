package com.co.storeview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class RegisterUserActivity : AppCompatActivity() {

    private lateinit var txtName: EditText;
    private lateinit var txtNick: EditText;
    private lateinit var txtEmail: EditText;
    private lateinit var txtPass: EditText;
    private lateinit var txtPassConfirm: EditText;
    private lateinit var txtNumberPhone: EditText;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_user)

    }
    fun register(view:View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    fun login(view:View){
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}
