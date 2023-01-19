package com.igk.teams_remote_assestment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        GlobalScope.launch {
            delay(1000)
            startActivity(Intent(this@SplashActivity,RegisterActivity::class.java))
            finish()
        }

    /*    Handler().postDelayed({
            startActivity(Intent(this@SplashActivity,RegisterActivity::class.java))
            finish()
        },1000)*/
    }
}