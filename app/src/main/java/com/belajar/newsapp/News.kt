package com.belajar.newsapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class News(
    var author: String = "",
    var description: String = "",
    var photo:Int = 0
) : Parcelable
