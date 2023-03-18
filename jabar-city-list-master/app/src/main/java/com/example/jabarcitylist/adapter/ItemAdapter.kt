package com.example.jabarcitylist.adapter

import android.content.Context
import android.service.autofill.Dataset
import android.service.autofill.FillContext
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.jabarcitylist.R
import com.example.jabarcitylist.model.JabarCityList
import java.lang.reflect.Type
import java.text.FieldPosition


//kode class ItemAdapter berfungsi untuk menyesuaikan data atau informasi yang akan ditampilkan
class ItemAdapter(
    private val context: Context,
    private val dataset: List<JabarCityList>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    //kode untuk membuat dan melakukan tampilan untuk RecyclerView
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_layout, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}