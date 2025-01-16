package com.example.annimation

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var startButton: Button
    private lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        startButton = findViewById(R.id.startButton)
        imageView = findViewById(R.id.imageView)
        val fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        val slideInAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_in)
        imageView.startAnimation(fadeInAnimation)

        slideInAnimation.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationEnd(animation: Animation?) {
                startButton.visibility = View.VISIBLE
                startButton.startAnimation(slideInAnimation)
            }
            override fun onAnimationRepeat(animation: Animation?) {}
            override fun onAnimationStart(animation: Animation?) {}
        })
        startButton.setOnClickListener {
            val intent = Intent(this, ActivityRegistration::class.java)
            startActivity(intent)
            finish()
        }
    }
}