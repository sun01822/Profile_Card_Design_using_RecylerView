package com.example.profilecard

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter(private val data: ArrayList<MyModelClass>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    private var mOnClickListener : OnClickListener ?= null
    private var checked : Int = 0
    class MyViewHolder(item : View) : RecyclerView.ViewHolder(item) {
        val profile:CircleImageView = item.findViewById(R.id.user_profile)
        val name: TextView = item.findViewById(R.id.user_name)
        val email: TextView = item.findViewById(R.id.user_email)
        val about: TextView = item.findViewById(R.id.user_about)
        val views: TextView = item.findViewById(R.id.user_views)
        val rank: TextView = item.findViewById(R.id.user_rank)
        val downloads: TextView = item.findViewById(R.id.user_downloads)
        val viewProfile: TextView = item.findViewById(R.id.viewProfile)
        val follow: TextView = item.findViewById(R.id.follow)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val myItem = LayoutInflater.from(parent.context).inflate(R.layout.sample_layout, parent, false)
        return MyViewHolder(myItem)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val singleData = data[position]
        Glide.with(holder.profile.context).load(singleData.profile).into(holder.profile)
        holder.name.text = singleData.name
        holder.email.text = singleData.email
        holder.about.text = singleData.about
        holder.views.text = singleData.view
        holder.rank.text = singleData.rank
        holder.downloads.text = singleData.downloads
        holder.follow.text = singleData.follow
        holder.viewProfile.setOnClickListener {
            if (mOnClickListener != null) {
                mOnClickListener!!.onClick(position, singleData)
            }
        }
        holder.follow.setOnClickListener {
            if(checked==0){
                holder.follow.text = "Following"
                holder.follow.setBackgroundResource(R.drawable.custom_button1)
                holder.follow.setTextColor(Color.WHITE)
                checked = 1
            }
            else{
                holder.follow.text = "Follow"
                holder.follow.setBackgroundResource(R.drawable.custom_button3)
                holder.follow.setTextColor(Color.BLACK)
                checked = 0
            }
        }
    }

    fun setOnClickListener(onClickListener: OnClickListener) {
        this.mOnClickListener = onClickListener
    }
    interface OnClickListener {
        fun onClick(index:Int, model: MyModelClass)
    }
}