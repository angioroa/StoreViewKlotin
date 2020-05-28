package com.co.storeview.data.dao
import androidx.room.*
import com.co.storeview.data.entities.Register

@Dao
interface RegisterDao {

    @Query("SELECT usuario, Contrasena FROM Register WHERE Usuario = :usuario and Contrasena= :contrasena")
    fun findByName(usuario: Register, contrasena: String): Register


    @Insert
    fun insertAll(vararg register: Register)
}