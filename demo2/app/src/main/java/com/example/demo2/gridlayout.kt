package com.example.demo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge

class gridlayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_gridlayout)
        var a = findViewById<ImageButton>(R.id.imageButton)


        a.setOnClickListener {
            Toast.makeText(this, "Image Clicked", Toast.LENGTH_LONG).show()
        }
    }
}