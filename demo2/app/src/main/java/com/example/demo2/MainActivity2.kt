package com.example.demo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val a = findViewById<EditText>(R.id.editText)
        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener {
        Toast.makeText(this, "Welcome back", Toast.LENGTH_LONG).show()
    }
}

}