package com.co.storeview.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.co.storeview.data.dao.RegisterDao
import com.co.storeview.data.entities.Register



@Database(entities = arrayOf(Register::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun registerDao(): RegisterDao
}

