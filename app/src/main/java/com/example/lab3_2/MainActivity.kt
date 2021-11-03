package com.example.lab3_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab3_2.databinding.Fragment1Binding


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = Fragment1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bnToSecond.setOnClickListener {
            goToSecond()
        }
        binding.bnToAbout.setOnClickListener {
            goToAbout()
        }
    }

    private fun goToSecond() {
        val intent = Intent(this, Activity2::class.java)
        startActivity(intent)
    }

    private fun goToAbout() {
        val intent = Intent(this, ActivityAbout::class.java)
        startActivity(intent)
    }
}