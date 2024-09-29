package com.example.recinrecview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.recinrecview.R
import com.example.recinrecview.model.GOTQuoteResponseItem

// https://medium.com/geekculture/android-listadapter-a-better-implementation-for-the-recyclerview-1af1826a7d21
class SimpleQuoteAdapter( val onItemClick: ItemClickListener): ListAdapter<GOTQuoteResponseItem,SimpleQuoteAdapter.MyViewHolder>(UserDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val quote = getItem(position)
       holder.name.text = quote.name
       holder.memberName.text = quote.slug
        holder.btnShot.setOnClickListener {
            onItemClick.onItemClick(quote = quote)
        }
    }

     class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var memberName = itemView.findViewById<TextView>(R.id.memberName)
        var name = itemView.findViewById<TextView>(R.id.name)
        var btnShot = itemView.findViewById<Button>(R.id.btnShow)
    }
}
private class UserDiffCallback: DiffUtil.ItemCallback<GOTQuoteResponseItem>(){
    override fun areItemsTheSame(
        oldItem: GOTQuoteResponseItem,
        newItem: GOTQuoteResponseItem
    ): Boolean {
       return oldItem == newItem
    }

    override fun areContentsTheSame(
        oldItem: GOTQuoteResponseItem,
        newItem: GOTQuoteResponseItem
    ): Boolean {
        return oldItem == newItem
    }

}
interface ItemClickListener{
    fun onItemClick(quote:GOTQuoteResponseItem)
}