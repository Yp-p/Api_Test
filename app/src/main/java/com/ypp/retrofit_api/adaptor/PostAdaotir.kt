package com.ypp.retrofit_api.adaptor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ypp.retrofit_api.R
import com.ypp.retrofit_api.model.Post
import com.ypp.retrofit_api.model.PostItem
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.item.view.*

class PostAdaotir(var postArrayList: ArrayList<PostItem>):RecyclerView.Adapter<PostAdaotir.PostViewHolder>(){
    class PostViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        fun bindPost(post: PostItem){
            itemView.text2.text=post.title
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return PostViewHolder(view)
    }

    override fun getItemCount(): Int {
        return postArrayList.size
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.bindPost(postArrayList[position])
    }
}