package com.example.finaluri1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class MainActivity3 : AppCompatActivity() {
    private lateinit var SignButton: Button
    private lateinit var Mail:EditText
    private lateinit var Password:EditText
    private lateinit var Auth:FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        Auth= FirebaseAuth.getInstance()
        Mail=findViewById(R.id.EnterMail)
        Password=findViewById(R.id.EnterPassword)
        SignButton = findViewById<Button>(R.id.SignButton)
        SignButton.setOnClickListener {
            val Email=Mail.text.toString()
            val Password1=Password.text.toString()
            SignUp(Email,Password1)

        }

    }
    private fun SignUp(Email:String,Password1:String) {
        Auth.createUserWithEmailAndPassword(Email, Password1).addOnCompleteListener {task ->
            if(task.isSuccessful) {
                startActivity(Intent(this, MainActivity2::class.java))
                Toast.makeText(this,"Registered!",Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"Error!",Toast.LENGTH_SHORT).show()
            }

        }
    }
}
