package com.ock.superkahramankitabi

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recyler_row.view.*

class RecyclerAdapter(
    val kahramanListesi: ArrayList<String>,
    val kahramanGorselleri: ArrayList<Int>
) : RecyclerView.Adapter<RecyclerAdapter.SuperKahramanVH>() {

    class SuperKahramanVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperKahramanVH {
        //Inflater
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.recyler_row, parent, false)
        return SuperKahramanVH(itemView)
    }

    override fun onBindViewHolder(holder: SuperKahramanVH, position: Int) {
        holder.itemView.recyclerViewTextView.text = kahramanListesi.get(position)
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, TanitimActivity::class.java)
            intent.putExtra("superKahramanIsmi", kahramanListesi.get(position))
            //val singleton = SingletonClass.SecilenKahraman
            //singleton.gorsel = kahramanGorselleri.get(position)
            intent.putExtra("superKahramanGorseli", kahramanGorselleri.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return kahramanListesi.size
    }

}