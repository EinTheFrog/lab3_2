package com.example.lab4_2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab4_2.databinding.Activity1Binding
import com.example.lab4_2.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {
    companion object {
        private const val ONLY_REQUEST = 0;
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnToThird.setOnClickListener {
            goToThird()
        }

        binding.btnToFirst.setOnClickListener {
            finish()
        }

        binding.btnToAbout.setOnClickListener {
            goToAbout()
        }
    }

    private fun goToThird() {
        val intent = Intent(this, Activity3::class.java)
        startActivityForResult(intent, ONLY_REQUEST)
    }

    private fun goToAbout() {
        val intent = Intent(this, ActivityAbout::class.java)
        startActivity(intent)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == 1) {
            finish()
        }
    }
}