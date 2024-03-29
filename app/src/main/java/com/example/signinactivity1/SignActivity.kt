package com.example.signinactivity1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SignActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var Login = findViewById<Button>(R.id.Login)
        var HomeLogin = findViewById<Button>(R.id.HomeLogin)

        var Id2 = findViewById<EditText>(R.id.id2)
        var Pw2 = findViewById<EditText>(R.id.pw2)

    }


}