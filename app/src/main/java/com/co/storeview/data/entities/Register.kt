package com.co.storeview.data.entities
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo
import androidx.room.Entity


data class Register (
    @ColumnInfo(name = "Usuario") var Usuario: String?,
    @ColumnInfo(name = "Nombre") var Nombre: String?,
    @ColumnInfo(name = "Email") var Email: String?,
    @ColumnInfo(name = "Contrasena") var Contrasena: String?,
    @ColumnInfo(name = "Telefono") var Telefono: String?
){
    @PrimaryKey(autoGenerate = true) var id: Int = 0
}