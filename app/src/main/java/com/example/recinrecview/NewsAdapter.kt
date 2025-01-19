package com.example.recinrecview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recinrecview.model.NewsResponse

class NewsAdapter() : ListAdapter<NewsResponse, NewsViewHolder>(diffUtils) {
    object diffUtils : DiffUtil.ItemCallback<NewsResponse>() {
        override fun areItemsTheSame(oldItem: NewsResponse, newItem: NewsResponse): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: NewsResponse, newItem: NewsResponse): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.news_item, parent, false)
        return NewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val news = getItem(position)
        holder.newsTitle.text = news.newsTitle
        holder.newsDesc.text = news.newsDesc
        Glide.with(holder.newsimg.context)
            .load(news.img)
            .placeholder(R.drawable.news_placeholder)
            .centerCrop()
            .into(holder.newsimg)
    }

//    override fun getItemCount(): Int {
//        return newsList.size
//    }
}

class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val newsTitle = itemView.findViewById<TextView>(R.id.txt_title)
    val newsDesc = itemView.findViewById<TextView>(R.id.txt_desc)
    val newsimg = itemView.findViewById<ImageView>(R.id.img_news)
}