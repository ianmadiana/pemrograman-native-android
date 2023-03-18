package com.example.infogempa.ui

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.infogempa.R
import com.example.infogempa.ui.InfoGempaApiStatus
import com.example.infogempa.network.InfoGempa

@BindingAdapter("listData")
fun bindRecyclerView(recyclerView: RecyclerView, data: List<InfoGempa>?) {
    val adapter = recyclerView.adapter as InfoGempaListAdapter
    adapter.submitList(data)
}

@BindingAdapter("apiStatus")
fun bindStatus(statusImageView: ImageView, status: InfoGempaApiStatus?) {
    when(status) {
        InfoGempaApiStatus.LOADING -> {
            statusImageView.visibility = View.VISIBLE
            statusImageView.setImageResource(R.drawable.loading_animation)
        }
        InfoGempaApiStatus.DONE -> {
            statusImageView.visibility = View.GONE
        }
        InfoGempaApiStatus.ERROR -> {
            statusImageView.visibility = View.VISIBLE
            statusImageView.setImageResource(R.drawable.ic_connection_error)
        }
        else -> throw IllegalStateException()
    }
}
