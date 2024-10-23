package com.example.activity1

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.activity1.R

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        val academics = findViewById<ImageButton>(R.id.edu)
        val hobbies = findViewById<ImageButton>(R.id.hobb)
        val projects = findViewById<ImageButton>(R.id.project)
        val skills = findViewById<ImageButton>(R.id.skill)

        academics.setOnClickListener {
            val intent = Intent(this, edu::class.java)
            startActivity(intent)
        }
        hobbies.setOnClickListener {
            val intent = Intent(this, hobbies::class.java)
            startActivity(intent)
        }
        projects.setOnClickListener {
            val intent = Intent(this, project::class.java)
            startActivity(intent)
        }
        skills.setOnClickListener {
            val intent = Intent(this, skills::class.java)
            startActivity(intent)
        }

        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.email -> {
                val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                    data = Uri.parse("mailto:")
                    putExtra(Intent.EXTRA_EMAIL, arrayOf("your_email@example.com"))
                    putExtra(Intent.EXTRA_SUBJECT, "Subject")
                    putExtra(Intent.EXTRA_TEXT, "Body")
                }
                startActivity(emailIntent)
                true
            }
            R.id.contact -> {
                val dialIntent = Intent(Intent.ACTION_DIAL).apply {
                    data = Uri.parse("tel:9087987987")
                }
                startActivity(dialIntent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}