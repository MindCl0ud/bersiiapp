package com.example.bersii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Scene
import android.transition.Transition
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class onboard1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard1)
        supportActionBar?.hide()

        val onbrdskp = findViewById<TextView>(R.id.skiponbrd1)
        onbrdskp.setOnClickListener{
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
        val onbrdnxt = findViewById<ImageView>(R.id.onbroadnxt1)
        onbrdnxt.setOnClickListener{
            val intent = Intent(this, onboard2::class.java)
            startActivity(intent)
        }
    }
}