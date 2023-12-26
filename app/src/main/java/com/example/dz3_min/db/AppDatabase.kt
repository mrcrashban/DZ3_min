package com.example.dz3_min.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    version = 1,
    entities = [
        Transactions::class,
        Categories::class,
        Accounts::class
    ]
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getTransactionsDao(): TransactionsDao

}