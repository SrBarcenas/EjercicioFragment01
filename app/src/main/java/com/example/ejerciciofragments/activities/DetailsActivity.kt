package com.example.ejerciciofragments.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejerciciofragments.R
import com.example.ejerciciofragments.fragments.DetailsFragment
import com.example.ejerciciofragments.models.Mail

class DetailsActivity : AppCompatActivity() {

    private var subject: String? = null
    private var message: String? = null
    private var senderName: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        if(intent.extras != null){
            subject = intent.getStringExtra("subject")
            message = intent.getStringExtra("message")
            senderName = intent.getStringExtra("senderName")
        }

        val mail = subject?.let{
                                    message?.let {
                                        it1 -> senderName?.let{
                                            it2 -> Mail(it, it1, it2)
                                        }
                                    }
                                }

        val detailsFragment = supportFragmentManager.findFragmentById(R.id.fragmentDetailsMail) as DetailsFragment?

        if(mail != null){
            detailsFragment?.renderMail(mail)
        }
    }
}