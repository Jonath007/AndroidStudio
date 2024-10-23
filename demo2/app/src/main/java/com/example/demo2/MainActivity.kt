package com.example.demo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var a = findViewById<EditText>(R.id.editTextText)
        var b = findViewById<EditText>(R.id.editTextText4)
        var btn = findViewById<Button>(R.id.button2)
        var txtvw = findViewById<TextView>(R.id.textView)

        btn.setOnClickListener{
            var c = a.text.toString()
            var d = b.text.toString()
            txtvw.text = "Your Name:" +" "+ c +"&"+ "Your Number is:"+" " + d
        }
    }
}