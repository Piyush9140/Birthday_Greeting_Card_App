package com.example.birthday

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.graphics.createBitmap

class MainActivity : AppCompatActivity() {
    private lateinit var btn : Button
    private lateinit var text1: EditText;
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.createBirthdayButton)
        text1=findViewById(R.id.nameInput)

        btn.setOnClickListener{
            startActivity(Intent(this,BirthdayGreetingActivity::class.java).putExtra("username",text1.text.toString()))
    }
    }

    fun createBirthdayCard(view: View) {}
}