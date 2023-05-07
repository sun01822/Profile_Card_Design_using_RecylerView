package com.example.profilecard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView

class DetailScreen : AppCompatActivity() {
    private lateinit var imageView: ImageView
    private lateinit var user_name: TextView
    private lateinit var user_views: TextView
    private lateinit var user_rank : TextView
    private lateinit var user_downloads: TextView
    private lateinit var description: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_screen)
        this.supportActionBar?.displayOptions = androidx.appcompat.app.ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar?.setCustomView(R.layout.center_title)
        imageView = findViewById(R.id.imageView)
        user_name = findViewById(R.id.user_name)
        user_views = findViewById(R.id.user_views)
        user_rank = findViewById(R.id.user_rank)
        user_downloads = findViewById(R.id.user_downloads)
        description = findViewById(R.id.description)

        val imageLink = intent.getStringExtra("image")
        Glide.with(this).load(imageLink).into(imageView)
        user_name.text = intent.getStringExtra("name")
        user_views.text = intent.getStringExtra("view")
        user_rank.text = intent.getStringExtra("rank")
        user_downloads.text = intent.getStringExtra("downloads")
        description.text = intent.getStringExtra("description")
    }
}