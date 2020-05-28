package com.co.storeview

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import androidx.navigation.findNavController
import com.co.storeview.data.entities.Register
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.doAsync
import androidx.room.Room
import com.co.storeview.data.AppDatabase
import org.jetbrains.anko.uiThread


class LoginActivity : AppCompatActivity() {

    lateinit var db:AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        Toast.makeText(this, "Ingrese con su usuario y contraeña", Toast.LENGTH_SHORT).show()

    }
    fun login(usuario: String, contraseña: String){
        var usuario = userText.text.toString()
        var contraseña = passTextIn.text.toString()

        doAsync {
            db.registerDao().findByName(User)
            uiThread {
                val intent = Intent(it, LoginActivity::class.java)
                startActivity(intent)
                finish()

            }
    fun logIn(view: View) {
        val myTextEmail = findViewById<EditText>(R.id.textEmail)
        val myPassText = findViewById<EditText>(R.id.passText)

        if (myTextEmail.text.toString() == "" || myPassText.text.toString() == "") {

        } else {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
        fun register(view:View) {
            signUpButton.setOnClickListener {
                val intento1 = Intent(this, RegisterUserActivity::class.java)
                startActivity(intento1)
            }

        }
}
