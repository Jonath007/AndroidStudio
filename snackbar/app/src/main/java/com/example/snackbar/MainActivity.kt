package com.example.snackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        enableEdgeToEdge()

        val sid = findViewById<Button>(R.id.button)
        sid.setOnClickListener{

            Snackbar.make(it, "You clicked me", Snackbar.LENGTH_LONG).setAction("undo"){
                Toast.makeText(this, "Undo was clicked", Toast.LENGTH_LONG).show()

            }.show()


        }
    }
}