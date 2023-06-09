package com.test.core.extension

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("loadImage")
fun loadImage(imageView: ImageView, imageUrl: String?) {
    imageUrl?.let{
        Glide.with(imageView.context)
            .load(imageUrl).into(imageView)
    }
}
