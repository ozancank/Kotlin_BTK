package com.ock.besinlerkitabi.util

import android.content.Context
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.ock.besinlerkitabi.R

//fun String.benimEklentim(parametre:String){
//    println(parametre)
//}

fun ImageView.gorselIndir(url: String?, placeHolder: CircularProgressDrawable) {
    val options = RequestOptions().placeholder(placeHolder).error(R.mipmap.ic_launcher_round)
    Glide.with(context).setDefaultRequestOptions(options).load(url).into(this)
}

fun placeHolderYap(context: Context): CircularProgressDrawable {
    return CircularProgressDrawable(context).apply {
        strokeWidth = 8f
        centerRadius = 40f
        start()
    }
}

@BindingAdapter("android:downloadImage")
fun downloadImage(view: ImageView, url: String?) {
    view.gorselIndir(url, placeHolderYap(view.context))
}