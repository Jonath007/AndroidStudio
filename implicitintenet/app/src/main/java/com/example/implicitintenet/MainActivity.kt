package com.example.implicitintenet

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import com.example.implicitintenet.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dailer = findViewById<Button>(R.id.button2)
        val call = findViewById<Button>(R.id.button)
        val contacts = findViewById<Button>(R.id.button3)
        val url = findViewById<Button>(R.id.button4)
        val locationButton = findViewById<Button>(R.id.button5)
        dailer.setOnClickListener {
            val intent1 = Intent(Intent.ACTION_DIAL)
            intent1.setData(Uri.parse("tel:9908717060"))
            startActivity(intent1)

        }
        call.setOnClickListener{
            val callIntent = Intent(Intent.ACTION_DIAL)
            callIntent.data = Uri.parse("tel:+1234567890")
            startActivity(callIntent)
        }
        contacts.setOnClickListener{
            val contactsIntent = Intent(Intent.ACTION_VIEW)
            contactsIntent.data = ContactsContract.Contacts.CONTENT_URI
            startActivity(contactsIntent)
        }
        url.setOnClickListener{
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.google.com")
            startActivity(openURL)
         }
        locationButton.setOnClickListener {
            // Create an implicit intent to open a location on Google Maps
            val geoUri = Uri.parse("geo:0,0?q=7P43+5W Phagwara, Punjab") // Place address or coordinates
            val mapIntent = Intent(Intent.ACTION_VIEW, geoUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }



    }
}