package com.example.birthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class BirthdayGreetingActivity : AppCompatActivity() {
    private lateinit var textview1 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        textview1=findViewById(R.id.BirthdayGreeting)
        val output=intent.getStringExtra("username")

        textview1.text= "       "+output+"!"

    }
}