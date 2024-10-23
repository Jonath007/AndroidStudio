package com.example.demo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge

class dropdown : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dropdown)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dropdown)
        val destinationSpinner:  Spinner = findViewById(R.id.spinner1)
        val packageListView: ListView = findViewById(R.id.list1)
        val destinations = arrayOf("Paris", "Newyork", "Tokyo")
        val packagesForParis = arrayOf("Efill Tower", "Louvre Museum", "Seine River")
        val packagesForNewyork = arrayOf("Statue of Liberty", "Central park", "World Trade center")
        val packagesForTokyo = arrayOf("Tokyo Tower", "Mountfuji", "Senso-i Temple")

        val spinnerAdapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,destinations)
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        destinationSpinner.adapter = spinnerAdapter
        val initialAdapter = ArrayAdapter(this,android.R.layout.simple_list_item1, packages)
        packageListView.adapter = initialAdapter
        destinationSpinner.onItemSelectedListener = object:AdapterView.OnItemSelectedListner{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                1 -> packageForNewyork
                else -> packageForTokyo
            }

            val listAdapter = ArrayAdapter()


        }
        }