package com.example.dz3_min.db

import android.content.Context
import androidx.room.Room

object Dependencies {

    private lateinit var applicationContext: Context

    fun init(context: Context) {
        applicationContext = context
    }

    private val appDatabase: AppDatabase by lazy {
        Room.databaseBuilder(applicationContext, AppDatabase::class.java, "database.db")
            .createFromAsset("room_article.db")
            .build()
    }
}