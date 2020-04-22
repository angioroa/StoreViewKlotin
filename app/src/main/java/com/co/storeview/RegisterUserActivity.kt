package com.co.storeview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

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
}
