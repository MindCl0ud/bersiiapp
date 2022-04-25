package com.example.bersii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class onboard2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard2)

        supportActionBar?.hide()

        val onbrdskp2 = findViewById<TextView>(R.id.skiponbrd2)
        onbrdskp2.setOnClickListener{
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
        val onbrdbck2 = findViewById<TextView>(R.id.bckonboard2)
        onbrdbck2.setOnClickListener{
            val intent = Intent(this, onboard1::class.java)
            startActivity(intent)
        }
        val onbrdnxt2 = findViewById<ImageView>(R.id.onbroadnxt2)
        onbrdnxt2.setOnClickListener{
            val intent = Intent(this, onboard3::class.java)
            startActivity(intent)
        }
    }
}