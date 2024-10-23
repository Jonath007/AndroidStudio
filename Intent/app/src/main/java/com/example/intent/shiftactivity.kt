package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge

class shiftactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shiftactivity)
        enableEdgeToEdge()
        var btn = findViewById<Button>(R.id.button2)

        btn.setOnClickListener{
            var intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("name","user")
            startActivity(intent)


        }
    }
}