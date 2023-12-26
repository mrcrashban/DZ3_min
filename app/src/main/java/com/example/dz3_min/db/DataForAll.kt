package com.example.dz3_min.db

data class DataForAll(
    val id: Int,
    val sum: Int,
    val category: String,
    val account: String,
    val type: String,
    val date: String,
    val comment: String
) {
    fun toTransactionDbEntity(): Transactions = Transactions(
        id = 0,
        sum = sum,
        category = category,
        account =  account,
        type = "earn",
        date = date,
        comment = comment
    )
}
