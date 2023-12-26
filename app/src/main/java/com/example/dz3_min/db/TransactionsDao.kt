package com.example.dz3_min.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface TransactionsDao {

    @Insert(entity = Transactions::class)
    fun insertNewTransactionsData(transactions: Transactions)

    @Query("SELECT * FROM transactions")
    fun getAllTransactionsData(): List<Transactions>

}