package com.example.ejerciciofragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import com.example.ejerciciofragments.R
import com.example.ejerciciofragments.models.Mail

class DetailsFragment : Fragment() {

    private lateinit var textViewFragmentSubject: TextView
    private lateinit var textViewFragmentSenderName: TextView
    private lateinit var textViewFragmentMessage: TextView
    private lateinit var fragmentDetailsMailWrapper: LinearLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_details, container, false)

        textViewFragmentSubject = view.findViewById(R.id.textViewFragmentSubject)
        textViewFragmentSenderName = view.findViewById(R.id.textViewFragmentSenderName)
        textViewFragmentMessage = view.findViewById(R.id.textViewFragmentMessage)
        fragmentDetailsMailWrapper = view.findViewById(R.id.fragmentDetailsMailWrapper)

        return view
    }

    fun renderMail(mail: Mail){
        fragmentDetailsMailWrapper.visibility = View.VISIBLE
        textViewFragmentSenderName.text = mail.senderName
        textViewFragmentMessage.text = mail.message
        textViewFragmentSubject.text = mail.subject
    }


}