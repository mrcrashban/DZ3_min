package com.example.dz3_min.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "transactions")
data class Transactions(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val sum: Int,
    val category: String,
    val account: String,
    val type: String,
    val date: String,
    val comment: String
)
