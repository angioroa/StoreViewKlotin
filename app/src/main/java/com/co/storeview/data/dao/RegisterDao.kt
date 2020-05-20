package com.co.storeview.data.dao
import androidx.room.*
import com.co.storeview.data.entities.Register

@Dao
interface RegisterDao {

    @Query("SELECT * FROM Register WHERE Usuario = :usuario")
    fun findByName(usuario: String): Usuario


}