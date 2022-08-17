package com.belajar.newsapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListNewsAdapter(private val listNews: ArrayList<News>) :
    RecyclerView.Adapter<ListNewsAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvAuthor: TextView = itemView.findViewById(R.id.tv_item_name)
        val tvDescription: TextView = itemView.findViewById(R.id.tv_item_detail)
        val imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_row_news, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val news = listNews[position]
        holder.tvAuthor.text = news.author
        holder.tvDescription.text = news.description
        Glide.with(holder.itemView.context)
            .load(news.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.itemView.setOnClickListener {
            val items = News(
                listNews[position].author,
                listNews[position].description,
                listNews[position].photo
            )
            val moveWithObjectIntent = Intent(holder.itemView.context, DetailActivity::class.java)
            moveWithObjectIntent.putExtra(DetailActivity.EXTRA, items)
            holder.itemView.context.startActivity(moveWithObjectIntent)
        }
    }

    override fun getItemCount(): Int = listNews.size

}


