package com.example.dz3_min

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(private val attributes: List<String>) :
    RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>(){
        class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
            val textViewAccount : TextView = itemView.findViewById(R.id.textViewAccount)
            val textViewCategories : TextView = itemView.findViewById(R.id.textViewCategories)
            val textViewSum : TextView = itemView.findViewById(R.id.textViewSum)
            val textViewType : TextView = itemView.findViewById(R.id.textViewType)
            val textViewDate : TextView = itemView.findViewById(R.id.textViewDate)
            val textViewComment : TextView = itemView.findViewById(R.id.textViewComment)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.recycler_fragment, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return attributes.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textViewAccount.text = attributes[position]
        holder.textViewCategories.text = attributes[position]
        holder.textViewSum.text = attributes[position]
        holder.textViewType.text = attributes[position]
        holder.textViewDate.text = attributes[position]
        holder.textViewComment.text = attributes[position]
    }

}
