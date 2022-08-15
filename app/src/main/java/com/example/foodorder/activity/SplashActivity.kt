package com.example.foodorder.activity

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.content.ContextCompat
import com.example.foodorder.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        //to display the next screen within 2 second and this screen acts like a Welcome Screen

        Handler().postDelayed({
            val mainIntent =
                Intent(this@SplashActivity, LoginRegisterActivity::class.java)
            finish()
            startActivity(mainIntent)
        }, 2000)


        if (Build.VERSION.SDK_INT >= 21)
        {
            window.statusBarColor = ContextCompat.getColor(this@SplashActivity, R.color.statusBar)
            window.navigationBarColor = ContextCompat.getColor(this@SplashActivity, R.color.statusBar)
        }
    }

    override fun onPause() {
        super.onPause()
        finish()
    }
}
