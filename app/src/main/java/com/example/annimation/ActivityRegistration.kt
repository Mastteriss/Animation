package com.example.annimation

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ActivityRegistration : AppCompatActivity() {
    private lateinit var registerTitle: TextView
    private lateinit var loginInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var registerButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registration)
        setContentView(R.layout.activity_registration)
        registerTitle = findViewById(R.id.registerTitle)
        loginInput = findViewById(R.id.loginInput)
        passwordInput = findViewById(R.id.passwordInput)
        registerButton = findViewById(
            R.id.registerButton
        )
        val slideInAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_in)
        val slideUpAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_up)


        registerTitle.startAnimation(slideInAnimation)
        loginInput.startAnimation(slideUpAnimation)
        passwordInput.startAnimation(slideUpAnimation)
        registerButton.startAnimation(slideUpAnimation)


        registerButton.setOnClickListener {
            val intent = Intent(this, WorkActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}