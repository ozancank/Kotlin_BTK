package com.ock.fotografpaylasmafirebase.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ock.fotografpaylasmafirebase.R
import com.ock.fotografpaylasmafirebase.model.Post
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.recycler_row.view.*

class HaberRecyclerAdapter(var postList: ArrayList<Post>) :
    RecyclerView.Adapter<HaberRecyclerAdapter.PostHolder>() {
    class PostHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostHolder {
        var inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.recycler_row, parent, false)
        return PostHolder(view)
    }

    override fun onBindViewHolder(holder: PostHolder, position: Int) {
        holder.itemView.recycler_row_kullanici_email.text = postList[position].kullaniciEmail
        holder.itemView.recycler_row_kullanici_yorumu.text = postList[position].kullaniciYorumu
        Picasso.get().load(postList[position].gorselUrl)
            .into(holder.itemView.recycler_row_imageView)
    }

    override fun getItemCount(): Int {
        return postList.size
    }
}