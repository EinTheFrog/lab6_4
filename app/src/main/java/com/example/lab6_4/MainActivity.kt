package com.example.lab6_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab6_4.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso
import java.net.URL

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (binding.imgView.drawable == null) {
            val url = "https://cdnuploads.aa.com.tr/uploads/Contents/2019/10/24/thumbs_b_c_fb8263ce4f9f43ebdc7634b0d1eb0a08.jpg?v=115427"
            Picasso.get().load(url).into(binding.imgView)
        }
    }
}