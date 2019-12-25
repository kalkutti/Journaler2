package com.mix.tipsytab

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mix.journaler2.Country
import com.mix.journaler2.R

class CategAdapter(val categList: List<Country>?) : RecyclerView.Adapter<CategAdapter.ViewHolder>() {


    override fun getItemCount() = categList!!.size

    private var mContext: Context? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        this.mContext=parent.context

        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.singlelistitem,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val mCateg = categList!!.get(position)

        if (mCateg.name != null) {
            holder.tvDes.setText(mCateg.name)
        }
    }

    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val tvDes:TextView = itemView.findViewById(R.id.tv_desc)
    }
}