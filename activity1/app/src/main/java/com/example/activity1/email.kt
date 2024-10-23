package com.example.activity1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class email : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email)

        // Display email in a TextView
        val emailTextView: TextView = findViewById(R.id.emailTextView)
        emailTextView.text = "jonath@lpu.in"
    }
}
