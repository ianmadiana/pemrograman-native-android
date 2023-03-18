package com.example.infogempa.ui

import android.view.LayoutInflater
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.ListView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.infogempa.databinding.ListViewItemBinding
import com.example.infogempa.network.InfoGempa

class InfoGempaListAdapter(val clickListener: InfoGempaListener) :
    ListAdapter<InfoGempa, InfoGempaListAdapter.InfoGempaViewHolder>(DiffCallback) {

        class InfoGempaViewHolder(
            var binding: ListViewItemBinding
        ) : RecyclerView.ViewHolder(binding.root){
            fun bind(clickListener: InfoGempaListener, infogempa: InfoGempa) {
                binding.infogempa = infogempa
                binding.clickListener = clickListener
                binding.executePendingBindings()
            }
        }

    companion object DiffCallback : DiffUtil.ItemCallback<InfoGempa>() {

        override fun areItemsTheSame(oldItem: InfoGempa, newItem: InfoGempa): Boolean {
            return oldItem.wilayah == newItem.wilayah
        }

        override fun areContentsTheSame(oldItem: InfoGempa, newItem: InfoGempa): Boolean {
            return oldItem.date == newItem.date && oldItem.date_time == newItem.date_time
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InfoGempaViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return InfoGempaViewHolder(
            ListViewItemBinding.inflate(layoutInflater, parent, false)
        )
    }

    override fun onBindViewHolder(holder: InfoGempaViewHolder, position: Int) {
        val infogempa = getItem(position)
        holder.bind(clickListener, infogempa)
    }
}

class InfoGempaListener(val clickListener: (infogempa: InfoGempa) -> Unit) {
    fun onClick(amphibian: InfoGempa) = clickListener(amphibian)
}