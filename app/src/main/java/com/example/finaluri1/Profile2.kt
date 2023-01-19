package com.example.finaluri1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Profile2 : AppCompatActivity() {
    var score=0
    private lateinit var Follow: Button
    private lateinit var Sub: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile2)
        Follow=findViewById(R.id.button)
        Sub=findViewById(R.id.textView11)

        Follow.setOnClickListener {
            Sub.text="$score"
            score+=1

        }
    }
}
