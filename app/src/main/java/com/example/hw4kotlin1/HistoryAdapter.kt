package com.example.hw4kotlin1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hw4kotlin1.databinding.ItemHistoryBinding

class HistoryAdapter: RecyclerView.Adapter<HistoryAdapter.ViewHolder>() {

    private var list = arrayListOf<String>()

    fun setList (list: ArrayList<String>){
        this.list = list
        notifyDataSetChanged()

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(ItemHistoryBinding.inflate(LayoutInflater.from(parent.context), parent, false ))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    class ViewHolder (private var binding: ItemHistoryBinding): RecyclerView.ViewHolder(binding.root)  {
        fun bind(s: String) {
            binding.tvResultHistory.text = s
        }


    }

}