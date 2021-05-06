package com.example.activitytest

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.activitytest.databinding.SecondLayoutBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: SecondLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SecondLayoutBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.button2.setOnClickListener{
            val intent = Intent()
            intent.putExtra("data_return", "Hello FirstActivity")
            setResult(RESULT_OK, intent)
            finish()
        }

    }

    override fun onBackPressed(){
        val intent = Intent()
        intent.putExtra("data_return", "Hello FirstActivity, I'm back")
        setResult(RESULT_OK, intent)
        finish()
    }

}