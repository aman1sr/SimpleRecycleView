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
class SimpleQuoteAdapter(val onItemClick: (GOTQuoteResponseItem) -> Unit) :
    ListAdapter<GOTQuoteResponseItem, SimpleQuoteAdapter.MyViewHolder>(UserDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val quote = getItem(position)
        holder.name.text = quote.name
        holder.memberName.text = quote.slug
        holder.btnShot.setOnClickListener {
            onItemClick.invoke(quote)
        }
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var memberName = itemView.findViewById<TextView>(R.id.memberName)
        var name = itemView.findViewById<TextView>(R.id.name)
        var btnShot = itemView.findViewById<Button>(R.id.btnShow)
    }
}

/*
* areItemsTheSame: Checks if two items represent the same logical entity (usually by comparing a unique identifier).
* areContentsTheSame: Checks if the content or properties of the item have changed (i.e., if the visual representation in the UI needs to be updated).
*                   Even if areItemsTheSame returns true (indicating that the items represent the same entity), areContentsTheSame checks if any data fields that affect the visual display (such as text, images, etc.) have changed.
*                   If areContentsTheSame method returns false, the RecyclerView will update the item by calling onBindViewHolder.
*
* Efficiency:
* If areItemsTheSame is true but areContentsTheSame is false, it will update only the modified item's content without creating a new view.
* If both are true, the adapter skips any unnecessary updates, making the scrolling and UI interaction faster.
*
* */
private class UserDiffCallback : DiffUtil.ItemCallback<GOTQuoteResponseItem>() {
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

interface ItemClickListener {
    fun onItemClick(quote: GOTQuoteResponseItem)
}