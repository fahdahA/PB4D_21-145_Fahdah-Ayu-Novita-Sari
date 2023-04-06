package com.example.aplikasiitokosepatu

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class halamanan_home : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var okeAdapter: OkeAdapter? = null
    private var datalist = mutableListOf<Users>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halamanan_home)

        datalist = ArrayList()
        recyclerView = findViewById(R.id.recyclerView)
        okeAdapter = OkeAdapter(this@halamanan_home, datalist)
        val layoutManager = GridLayoutManager(applicationContext, 2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = okeAdapter

        prepareDataList()

    }

    private fun prepareDataList() {
        datalist.add(Users(R.drawable.gam1, "Old Skool Sneakers", "Rp.1.128.000"))
        datalist.add(Users(R.drawable.gam2, "Air Force 1'07 Shoes ", "Rp.1.549.000"))
        datalist.add(Users(R.drawable.gam3, "Paulmay Sneakers ", "Rp.191.000"))
        datalist.add(Users(R.drawable.gam4, "High-Top Sneakers", "Rp.1.199.000"))
        datalist.add(Users(R.drawable.gam5, "Classic Slip-On", "Rp.999.000"))
        datalist.add(Users(R.drawable.gam6, "Old Skool Sneakers", "Rp.1.199.000"))
        datalist.add(Users(R.drawable.gam7, "Classic Slip-On", "Rp.659.400"))
        datalist.add(Users(R.drawable.gam8, "High-Top Sneakers", "Rp.1.199.000"))
        datalist.add(Users(R.drawable.gam9, "Converse All Star", "Rp.839.300"))
        datalist.add(Users(R.drawable.gam10, "Comfycush Slip-On", "Rp.1.189.500"))
        datalist.add(Users(R.drawable.gam11, "Classic Slip-On", "Rp.999.000"))
        datalist.add(Users(R.drawable.gam12, "Classic Slip-On", "Rp.1.199.000"))

    }
}









