package com.example.ejerciciofragments.models

import com.example.ejerciciofragments.utils.Util

data class Mail(
    val subject: String,
    val message: String,
    val senderName: String
){
    val color: String = Util.getRandomColor()
}
