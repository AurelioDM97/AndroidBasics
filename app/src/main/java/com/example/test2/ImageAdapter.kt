package com.example.test2


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.test2.databinding.ItemLayoutBinding

class ImageAdapter(private val items: ArrayList<Image>) : RecyclerView.Adapter<ImageAdapter.MyView>() {


    inner class MyView(val itemBinding: ItemLayoutBinding) : RecyclerView.ViewHolder(itemBinding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyView {

        return MyView(ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: MyView, position: Int) {

        holder.itemBinding.imageView.setImageResource(items[position].image)
        holder.itemBinding.imageText.text = items[position].name
    }

    override fun getItemCount(): Int {
        return items.size
    }
}

