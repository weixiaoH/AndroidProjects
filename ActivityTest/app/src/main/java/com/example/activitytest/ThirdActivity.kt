package com.example.activitytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.activitytest.databinding.SecondLayoutBinding
import com.example.activitytest.databinding.ThirdLayoutBinding

class ThirdActivity : BaseActivity() {

    private lateinit var binding: ThirdLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ThirdLayoutBinding.inflate(layoutInflater)
        Log.d("ThirdActivity", "Task id is $taskId")
        setContentView(binding.root)
        binding.button3.setOnClickListener{
            ActivityCollector.finishAll()
        }

    }
}