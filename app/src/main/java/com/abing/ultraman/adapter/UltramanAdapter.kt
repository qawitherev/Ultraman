package com.abing.ultraman.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.abing.ultraman.R
import com.abing.ultraman.UltramanListFragmentDirections
import com.abing.ultraman.databinding.UltramanItemBinding
import com.abing.ultraman.model.Ultraman

class UltramanAdapter(private val context: Context, private val dataset: List<Ultraman>)
    : RecyclerView.Adapter<UltramanAdapter.UltramanViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UltramanViewHolder {
        val binding = UltramanItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UltramanViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UltramanViewHolder, position: Int) {
        val ultraman = dataset[position]
        holder.binding.ultramanImage.setImageResource(ultraman.ultramanImage)
        holder.binding.ultramanName.text = context.resources.getString(ultraman.ultramanName)
        holder.binding.ultramanCard.setOnClickListener {
//            it.findNavController().navigate(R.id.action_ultramanListFragment_to_ultramanDetailFragment)
            val action = UltramanListFragmentDirections.actionUltramanListFragmentToUltramanDetailFragment(
                ultramanName = holder.binding.ultramanName.toString()
            )
            it.findNavController().navigate(action)
        }
    }


    override fun getItemCount(): Int {
        return dataset.size
    }

    class UltramanViewHolder(val binding: UltramanItemBinding): RecyclerView.ViewHolder(binding.root) {

    }
}