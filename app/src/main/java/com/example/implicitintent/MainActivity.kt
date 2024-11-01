package com.example.implicitintent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val instaButton = findViewById<CardView>(R.id.Insta)
        val cameraButton = findViewById<CardView>(R.id.camera)

        instaButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.linkedin.com/in/akhilesh-singh-maurya-500b91257/")
            startActivity(intent)
        }
        cameraButton.setOnClickListener {
            val intent = Intent(
                MediaStore.ACTION_IMAGE_CAPTURE

            )

            startActivity(intent)
        }

    }
}