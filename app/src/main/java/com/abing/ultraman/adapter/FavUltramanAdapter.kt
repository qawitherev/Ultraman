package com.abing.ultraman.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.abing.ultraman.databinding.FavUltramanItemBinding
import com.abing.ultraman.model.Ultraman

class FavUltramanAdapter(private val context: Context, private val dataset: List<Ultraman>): RecyclerView.Adapter<FavUltramanAdapter.FavUltramanViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavUltramanViewHolder {
        val binding = FavUltramanItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FavUltramanViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FavUltramanViewHolder, position: Int) {
        val ultraman = dataset[position]
        holder.binding.favUltramanName.text = context.resources.getString(ultraman.ultramanName)
        holder.binding.favUltramanImage.setImageResource(ultraman.ultramanImage)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    class FavUltramanViewHolder(val binding: FavUltramanItemBinding): RecyclerView.ViewHolder(binding.root){

    }
}