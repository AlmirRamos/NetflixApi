package com.appfilmes.netflixapi.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.appfilmes.netflixapi.databinding.ItemFilmeBinding

class FilmeAdapter() : RecyclerView.Adapter<FilmeAdapter.FilmeViewHolder>() {

    inner class FilmeViewHolder(itemFilme: ItemFilmeBinding)
        : RecyclerView.ViewHolder(itemFilme.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmeViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: FilmeViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


}