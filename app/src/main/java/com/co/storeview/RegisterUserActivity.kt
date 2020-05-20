package com.co.storeview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

import android.widget.ArrayAdapter
import android.widget.SpinnerAdapter
import android.widget.Toast
import androidx.room.Room
import com.co.storeview.data.AppDatabase
import com.co.storeview.data.entities.Register
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread


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
     var db = Room.databaseBuilder(
    applicationContext,
    AppDatabase::class.java, "database-name"
    ).build()

}
