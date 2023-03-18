package com.example.filmnation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.filmnation.R
import com.example.filmnation.model.FilmNation

class ItemAdapter (
    private val context: Context,
    private val dataset: List<FilmNation>
    ) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        //menampilkan title
        val textView: TextView = view.findViewById(R.id.item_title)
        //menampilkan gambar
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    //membuat holder tampilan baru untuk RecyclerView
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    //mengganti isi tampilan item daftar
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text =  context.resources.getString(item.stringResourceId)
        //menampilkan gambar
        holder.imageView.setImageResource(item.imageResourceId)
    }

    //menampilkan ukuran dataset
    override fun getItemCount(): Int {

        return dataset.size
    }
}