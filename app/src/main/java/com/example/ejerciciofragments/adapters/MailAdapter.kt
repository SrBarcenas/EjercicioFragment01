package com.example.ejerciciofragments.adapters

import android.content.Context
import android.graphics.Color
import android.graphics.PorterDuff
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ejerciciofragments.R
import com.example.ejerciciofragments.models.Mail

class MailAdapter(
    private val context: Context,
    private val layout: Int,
    private val list: List<Mail>

) : BaseAdapter() {

    private val SUBJECT_MAX_LENGTH = 40
    private val MESSAGE_MAX_LENGTH = 80

    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Mail {
        return list[position]
    }

    override fun getItemId(id: Int): Long {
        return id.toLong()
    }

    override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View {
        var convertView = convertView
        var holder: ViewHolder

        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(layout, null)
            holder = ViewHolder()
            holder.subject = convertView.findViewById(R.id.textViewListSubject)
            holder.message = convertView.findViewById(R.id.textViewListMessage)
            holder.senderName = convertView.findViewById(R.id.textViewListSenderName)
            convertView.tag = holder
        }else{
            holder = convertView.tag as ViewHolder
        }

        val currentMail = getItem(position)
        val shortSubject = if(currentMail.subject.length > SUBJECT_MAX_LENGTH){
            currentMail.subject.substring(0, SUBJECT_MAX_LENGTH) + "..."
        }else{
            currentMail.subject
        }

        holder.subject.text = shortSubject

        val shortMessage = if(currentMail.message.length > MESSAGE_MAX_LENGTH){
            currentMail.message.substring(0, SUBJECT_MAX_LENGTH) + "..."
        }else{
            currentMail.message
        }

        holder.message.text = shortMessage

        holder.senderName.text = currentMail.senderName.substring(0, 1)
        holder.senderName.background.setColorFilter(Color.parseColor("#" + currentMail.color), PorterDuff.Mode.SRC)

        return convertView!!
    }

    internal class ViewHolder {
        lateinit var subject: TextView
        lateinit var message: TextView
        lateinit var senderName: TextView
    }
}