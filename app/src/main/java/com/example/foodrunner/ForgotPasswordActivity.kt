package com.example.foodrunner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ForgotPasswordActivity : AppCompatActivity() {
    lateinit var etForgotMobile: EditText
    lateinit var etForgotEmail: EditText
    lateinit var btnForgotNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_forgot_password)

        etForgotMobile = findViewById(R.id.etForgotMobile)
        etForgotEmail = findViewById(R.id.etForgotEmail)
        btnForgotNext = findViewById(R.id.btnForgotNext)

        btnForgotNext.setOnClickListener {

            val intent = Intent(this@ForgotPasswordActivity, DashboardActivity::class.java)

            val bundle = Bundle()

            bundle.putString("data", "forgot")

            bundle.putString("mobile", etForgotMobile.text.toString())
            bundle.putString("email", etForgotEmail.text.toString())

            intent.putExtra("details", bundle)

            startActivity(intent)
        }
    }
}