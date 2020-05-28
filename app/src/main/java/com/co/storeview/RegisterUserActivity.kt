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
import kotlinx.android.synthetic.main.activity_register_user.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread


class RegisterUserActivity : AppCompatActivity() {

    var register: Register? = null
    lateinit var db:AppDatabase
    private lateinit var txtName: EditText;
    private lateinit var txtNick: EditText;
    private lateinit var txtEmail: EditText;
    private lateinit var txtPass: EditText;
    private lateinit var txtPassConfirm: EditText;
    private lateinit var txtNumberPhone: EditText;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_user)

        db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "database_name"
        ).build()


    }
    fun login(view:View){
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

    fun save(view: View){
        var usuario = userText.text.toString()
        var nombre = nameText.text.toString()
        var email = emailText.text.toString()
        var contraseña = passTextIn.text.toString()
        var telefono = numberPhoneText.text.toString()
        if(!usuario.isNullOrEmpty()&& nombre != null){

            insertUser(usuario, nombre, email, contraseña, telefono)
        }
        else{
                Toast.makeText(this, "El usuario es obligatorio", Toast.LENGTH_SHORT).show()
        }
    }
    fun insertUser(usuario: String, nombre: String, email: String, contraseña: String, telefono: String){
        var newUser = Register(usuario, nombre, email, contraseña, telefono)
        doAsync {
            db.registerDao().insertAll(newUser)
            uiThread {
                val intent = Intent(it, LoginActivity::class.java)
                startActivity(intent)
                finish()

            }
        }
    }
}
