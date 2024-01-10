package com.example.ejerciciofragments.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejerciciofragments.R
import com.example.ejerciciofragments.fragments.DetailsFragment
import com.example.ejerciciofragments.fragments.ListFragment
import com.example.ejerciciofragments.models.Mail

class MainActivity : AppCompatActivity(), ListFragment.OnFragmentInteractionListener {

    private  var isMultiPanel = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setMultiPanel()
    }

    override fun onListClick(mail: Mail) {
        if (isMultiPanel) {
            val detailsFragment = supportFragmentManager.findFragmentById(R.id.fragmentDetailsMail) as DetailsFragment?
            detailsFragment?.renderMail(mail)
        } else {
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("subject", mail.subject)
            intent.putExtra("message", mail.message)
            intent.putExtra("senderName", mail.senderName)
            startActivity(intent)
        }
    }

    private fun setMultiPanel(){
        isMultiPanel = (supportFragmentManager.findFragmentById(R.id.fragmentDetailsMail) != null)
    }
}