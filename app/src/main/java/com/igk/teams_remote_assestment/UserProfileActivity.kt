package com.igk.teams_remote_assestment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class UserProfileActivity : AppCompatActivity() {

    lateinit var submit:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)

        submit = findViewById(R.id.setupButton)
        submit.setOnClickListener{
            startActivity(Intent(this@UserProfileActivity,UserDashboard::class.java))
        }
    }
}