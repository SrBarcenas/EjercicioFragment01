package com.example.ejerciciofragments.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import com.example.ejerciciofragments.R
import com.example.ejerciciofragments.adapters.MailAdapter
import com.example.ejerciciofragments.models.Mail
import com.example.ejerciciofragments.utils.Util

class ListFragment : Fragment() {

    private lateinit var listView: ListView
    private lateinit var mails: List<Mail>
    private lateinit var adapter: MailAdapter
    private var mListener: OnFragmentInteractionListener? = null

    interface OnFragmentInteractionListener{
        fun onListClick(mail: Mail)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_list, container, false)

        listView = view.findViewById(R.id.listViewMails)
        mails = Util.getDummyData()
        adapter = MailAdapter(requireContext(), R.layout.list_view_mail, mails)

        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            mListener?.onListClick(mails[position])
        }

        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        mListener = if(context is OnFragmentInteractionListener){
                context
        } else{
            throw RuntimeException("$context implementando OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        mListener = null
    }


}