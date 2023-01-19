package com.example.finaluri1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    private lateinit var MoreButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        MoreButton = findViewById(R.id.button)
        MoreButton.setOnClickListener {
            startActivity(Intent(this, home::class.java))
        }

    }
}