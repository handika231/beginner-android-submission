package com.belajar.newsapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        //hide toolbar
        supportActionBar?.hide()
        //create splash screen
        Thread(Runnable {
            try {
                Thread.sleep(3000)
                //start main activity
                startActivity(
                    Intent(
                        this@SplashActivity,
                        MainActivity::class.java
                    )
                )
                //finish splash screen
                finish()
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
        }).start()
    }
}