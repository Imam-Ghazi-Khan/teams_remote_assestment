package com.igk.teams_remote_assestment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {

    lateinit var existingUser:TextView
    lateinit var registerButton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        existingUser = findViewById(R.id.existingUserLoginIn)
        registerButton = findViewById(R.id.registerButton)

        existingUser.setOnClickListener{
            startActivity(Intent(this@RegisterActivity,LoginActivity::class.java))
        }
        registerButton.setOnClickListener {
            startActivity(Intent(this@RegisterActivity, LoginActivity::class.java))
        }

    }
}