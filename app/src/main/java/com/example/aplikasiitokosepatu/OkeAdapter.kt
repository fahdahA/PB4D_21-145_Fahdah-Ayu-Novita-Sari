package com.example.aplikasiitokosepatu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class OkeAdapter constructor(private val gethalamanan_home: halamanan_home, private val datalist : List<Users>) :
    RecyclerView.Adapter<OkeAdapter.ViewHolder>() {

    class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        var image: ImageView
        var title : TextView
        var desc : TextView
        var cardView : CardView

        init {
            image = itemView.findViewById(R.id.image)
            title = itemView.findViewById(R.id.title)
            desc = itemView.findViewById(R.id.desc)
            cardView = itemView.findViewById((R.id.cardView))
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list,parent,false)
        return ViewHolder(view)
    }
    override fun getItemCount() = datalist.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var data = datalist[position]

        holder.title.text = data.title
        holder.desc.text = data.desc
        holder.image.setImageResource(data.imange)

        holder.cardView.setOnClickListener {
            Toast.makeText(gethalamanan_home, datalist[position].title, Toast.LENGTH_SHORT).show()
        }
    }
}





