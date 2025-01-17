package com.capstone.cleanup.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.capstone.cleanup.databinding.ActivityHomeBinding
import com.capstone.cleanup.ui.login.LoginActivity
import com.capstone.cleanup.ui.register.RegisterActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        enableEdgeToEdge()
        supportActionBar?.hide()
        with(binding){
            btnLogin.setOnClickListener {
                val intent = Intent(this@HomeActivity, LoginActivity::class.java)
                startActivity(intent)
            }

            btnRegister.setOnClickListener {
                val intent = Intent(this@HomeActivity, RegisterActivity::class.java)
                startActivity(intent)
            }
        }
    }
}