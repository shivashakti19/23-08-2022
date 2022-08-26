package com.example.practice26

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var textview=findViewById<TextView>(R.id.txtv1)
        val mobile = findViewById<EditText>(R.id.edt)
        val email = findViewById<EditText>(R.id.edt1)
        val password = findViewById<EditText>(R.id.edt2)
        val repassword = findViewById<EditText>(R.id.edt3)
        val login = findViewById<Button>(R.id.logbtn)
        val sigin = findViewById<Button>(R.id.sgbtn)

        login.setOnClickListener(){
            val i = Intent(applicationContext, MainActivity::class.java)
            startActivity(i)
        }

        sigin.setOnClickListener(){
            val i = Intent(applicationContext, MainActivity2::class.java)
            startActivity(i)
        }




    }
}