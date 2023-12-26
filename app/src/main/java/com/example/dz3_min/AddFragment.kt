package com.example.dz3_min

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.ImageButton

class AddFragment : Fragment(R.layout.fragment_add_fragment) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<ImageButton>(R.id.go_back_add).setOnClickListener {
            val fragment = MainFragment()
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.container, fragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }
}