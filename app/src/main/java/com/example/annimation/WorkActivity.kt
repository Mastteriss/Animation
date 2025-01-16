package com.example.annimation

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class WorkActivity : AppCompatActivity() {
    private lateinit var backButton: Button
    private lateinit var welcomeText: TextView
    private lateinit var fadeInAnimation: Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_work)
        backButton = findViewById(R.id.backButton)
        welcomeText = findViewById(R.id.welcomeText)


        welcomeText.text = "Добро пожаловать в WorkActivity!"


        fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in)


        backButton.startAnimation(fadeInAnimation)
        backButton.visibility = View.VISIBLE

        backButton.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}