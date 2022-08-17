package com.belajar.newsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.belajar.newsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var list: ArrayList<News> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvNews.setHasFixedSize(true)
        list.addAll(NewsData.listData)
        showRecyclerList()

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setItem(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setItem(itemId: Int) {
        when (itemId) {
            R.id.profile -> {
                val settingIntent = Intent(this, ProfileActivity::class.java)
                startActivity(settingIntent)
            }
        }
    }

    private fun showRecyclerList() {
        binding.rvNews.layoutManager = LinearLayoutManager(this)
        val listNewsAdapter = ListNewsAdapter(list)
        binding.rvNews.adapter = listNewsAdapter
    }
}