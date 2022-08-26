package com.example.practice26

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val login = findViewById<Button>(R.id.logbtn)
        val sigin = findViewById<Button>(R.id.sgbtn)
        val textview = findViewById<TextView>(R.id.txtv1)
        val email = findViewById<EditText>(R.id.edt1)
        val password = findViewById<EditText>(R.id.edt2)

        login.setOnClickListener(){
            val i = Intent(applicationContext, MainActivity2::class.java)
            startActivity(i)
        }

        sigin.setOnClickListener(){
            val i = Intent(applicationContext, MainActivity3::class.java)
            startActivity(i)
        }



    }



}