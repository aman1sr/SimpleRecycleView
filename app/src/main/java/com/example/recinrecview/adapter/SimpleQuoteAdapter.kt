package com.example.recinrecview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recinrecview.R
import com.example.recinrecview.model.GOTQuoteResponseItem

class SimpleQuoteAdapter(val quotes: ArrayList<GOTQuoteResponseItem>, val onItemClick: ItemClickListener): RecyclerView.Adapter<SimpleQuoteAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       holder.name.text = quotes[position].name
       holder.memberName.text = quotes[position].slug
        holder.btnShot.setOnClickListener {
            onItemClick.onItemClick(quote = quotes[position])
        }
    }

    override fun getItemCount(): Int {
       return quotes.size
    }

     class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var memberName = itemView.findViewById<TextView>(R.id.memberName)
        var name = itemView.findViewById<TextView>(R.id.name)
        var btnShot = itemView.findViewById<Button>(R.id.btnShow)
    }
}
interface ItemClickListener{
    fun onItemClick(quote:GOTQuoteResponseItem)
}