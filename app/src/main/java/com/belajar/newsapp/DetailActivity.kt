package com.belajar.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.belajar.newsapp.databinding.ActivityDetailBinding
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {
    //create binding
    private lateinit var binding: ActivityDetailBinding

    companion object {
        const val EXTRA = "extra_name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val item = intent.getParcelableExtra<News>(EXTRA) as News
        Glide.with(this).load(item.photo).into(binding.imgDetail)
        binding.tvAuthorDetail.text = item.author
        binding.tvDescriptionDetail.text = item.description
    }

}