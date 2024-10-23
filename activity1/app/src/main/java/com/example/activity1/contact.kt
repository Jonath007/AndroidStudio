package com.example.activity1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class contact : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        // Display contact details in a TextView
        val contactTextView: TextView = findViewById(R.id.contact)
        contactTextView.text = "Contact: +91 1234567890\nAddress: Lovely Professional University"
    }
}
