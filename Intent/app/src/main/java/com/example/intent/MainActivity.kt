package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        enableEdgeToEdge()
        var input = findViewById<EditText>(R.id.editTextText)
        var input2 = findViewById<EditText>(R.id.editTextNumberPassword)
        var btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener {
            Toast.makeText(this, input.text, Toast.LENGTH_LONG).show()

            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

        }
    }
}