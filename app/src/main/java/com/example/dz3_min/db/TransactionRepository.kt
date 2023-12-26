package com.example.dz3_min.db

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class TransactionRepository(private val transactionsDao: TransactionsDao) {

    suspend fun insertNewTransactionData(transactions: Transactions){
        withContext(Dispatchers.IO) {
            transactionsDao.insertNewTransactionsData(transactions)
        }
    }

    suspend fun getAllTransactionsData(): List<Transactions> {
        return withContext(Dispatchers.IO) {
            return@withContext transactionsDao.getAllTransactionsData()
        }
    }
}