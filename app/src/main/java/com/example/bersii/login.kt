package com.example.bersii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //function to move to activity
        val signbtnlog = findViewById<Button>(R.id.signupbtnlogin)
        signbtnlog.setOnClickListener{
            val intent = Intent(this, Registrasi::class.java)
            startActivity(intent)
        }
        val emaillog = findViewById<EditText>(R.id.emaillogin)
        val passlog = findViewById<EditText>(R.id.passwordlogin)
        val logbtnlog = findViewById<Button>(R.id.loginbtnlogin)
        val db = DBHelper(this, null)
        val cursor = db.getUser()
        logbtnlog.setOnClickListener{
            //if(emaillog.text.toString().equals("gpaham")){
                val intent = Intent(this, home::class.java)
                startActivity(intent)
            //}
            //else{
            //    Toast.makeText(this, "WRONG", Toast.LENGTH_LONG).show()
            //}
            //cursor?.close()
        }
        supportActionBar?.hide()//hideactionbar
    }
}