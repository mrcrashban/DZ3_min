package com.example.dz3_min

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dz3_min.db.AppDatabase
import com.example.dz3_min.db.TransactionRepository
import com.example.dz3_min.db.Transactions
import com.example.dz3_min.db.TransactionsDao
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainFragment() : Fragment(R.layout.fragment_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.button_go_to_add).setOnClickListener {
            val fragment = AddFragment()
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.container, fragment)
            transaction.addToBackStack(null)
            transaction.commit()

            CoroutineScope(Dispatchers.IO).launch {
                val newTransactions = Transactions(0,100,"water","cash","earn","26.12.2023","ab")
                val transactionRepository = TransactionRepository(transactionsDao = TransactionsDao.insertNewTransactionData(newTransactions.toTransactionDbEntity()))
            }
        }
        val recyclerView: RecyclerView = requireView().findViewById(R.id.RecyclerView_main)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = RecyclerAdapter(getCatList())
    }
    private fun getCatList(): List<String> {
        return this.resources.getStringArray(R.array.cat_names).toList()
    }
}