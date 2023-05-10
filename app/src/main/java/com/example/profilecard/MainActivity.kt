package com.example.profilecard

import android.app.ActionBar
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.profilecard.data.Data

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView : RecyclerView
    var data = Data()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.supportActionBar?.displayOptions = androidx.appcompat.app.ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar?.setCustomView(R.layout.center_title)
        recyclerView = findViewById(R.id.recyclerView)
        data.loadData()
        initRecyclerView()
    }
    fun initRecyclerView() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = MyAdapter(data.dataSource)
        recyclerView.adapter = adapter

        adapter.setOnClickListener(object: MyAdapter.OnClickListener{
            override fun onClick(index: Int, model: MyModelClass) {
                val intent = Intent(this@MainActivity, DetailScreen::class.java)
                intent.putExtra("image", model.profile)
                intent.putExtra("name", model.name)
                intent.putExtra("view", model.view)
                intent.putExtra("rank", model.rank)
                intent.putExtra("downloads", model.downloads)
                intent.putExtra("description", model.description)
                startActivity(intent)
            }

        })

    }
}