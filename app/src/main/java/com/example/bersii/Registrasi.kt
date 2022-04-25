package com.example.bersii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Registrasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrasi)

        //function to move to activity
        val logbtnreg = findViewById<Button>(R.id.loginbtnregis)
        logbtnreg.setOnClickListener{
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }


        supportActionBar?.hide()//hideactionbar

        // below code is to add on click
        // listener to our add name button
        val signbtnreg = findViewById<Button>(R.id.signupbtnregis)
        signbtnreg.setOnClickListener{

            // below we have created
            // a new DBHelper class,
            // and passed context to it
            val db = DBHelper(this, null)

            // creating variables for values
            // in name and age edit texts
            val emailregis = findViewById<EditText>(R.id.emailregis)
            val passregis = findViewById<EditText>(R.id.passregis)
            val email = emailregis.text.toString()
            val pass = passregis.text.toString()

            // calling method to add
            // name to our database
            db.addUser(email, pass)

            // Toast to message on the screen
            Toast.makeText(this, "success create account", Toast.LENGTH_LONG).show()

            // at last, clearing edit texts
            emailregis.text.clear()
            passregis.text.clear()
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }

        // below code is to add on  click
        // listener to our print name button
        /*
        printemail.setOnClickListener{

            // creating a DBHelper class
            // and passing context to it
            val db = DBHelper(this, null)

            // below is the variable for cursor
            // we have called method to get
            // all names from our database
            // and add to name text view
            val cursor = db.getName()

            // moving the cursor to first position and
            // appending value in the text view
            cursor!!.moveToFirst()
            Name.append(cursor.getString(cursor.getColumnIndex(DBHelper.NAME_COl)) + "\n")
            Email.append(cursor.getString(cursor.getColumnIndex(DBHelper.EMAIL_COL)) + "\n")

            // moving our cursor to next
            // position and appending values
            while(cursor.moveToNext()){
                Name.append(cursor.getString(cursor.getColumnIndex(DBHelper.NAME_COl)) + "\n")
                Email.append(cursor.getString(cursor.getColumnIndex(DBHelper.EMAIL_COL)) + "\n")
            }

            // at last we close our cursor
            cursor.close()
        }*/
    }
}