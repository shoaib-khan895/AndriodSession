package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.login_activity.*


class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        submit.setOnClickListener {
           
            if (TextUtils.isEmpty(email.getText())) {
                password.setError("password is requires!")
                email.setError("email is required!")
            } else {
                val intent = Intent(this,WelcomeActivity::class.java)
                startActivity(intent)

        }

    }
}}
