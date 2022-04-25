package com.example.bersii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class onboard3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard3)

        supportActionBar?.hide()

        val onbrdskp2 = findViewById<TextView>(R.id.skiponbrd3)
        onbrdskp2.setOnClickListener{
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
        val onbrdbck2 = findViewById<TextView>(R.id.bckonboard3)
        onbrdbck2.setOnClickListener{
            val intent = Intent(this, onboard2::class.java)
            startActivity(intent)
        }
        val onbrdnxt3 = findViewById<ImageView>(R.id.onbroadnxt3)
        onbrdnxt3.setOnClickListener{
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
    }
}