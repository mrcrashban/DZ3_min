package com.example.dz3_min.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "categories")
data class Categories(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val name: String
)
