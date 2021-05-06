package com.example.activitytest

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.activitytest.databinding.SecondLayoutBinding

class SecondActivity : BaseActivity() {

    private lateinit var binding: SecondLayoutBinding

    companion object {
        fun actionStart(context: Context, data1: String, data2: String) {
            val intent = Intent(context, SecondActivity::class.java)
            intent.putExtra("param1", data1)
            intent.putExtra("param2", data2)
            context.startActivity(intent)
        }
    }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SecondLayoutBinding.inflate(layoutInflater)
        Log.d("SecondActivity", "Task id is $taskId")
        setContentView(binding.root)
//        binding.button2.setOnClickListener{
//            val intent = Intent()
//            intent.putExtra("data_return", "Hello FirstActivity")
//            setResult(RESULT_OK, intent)
//            finish()
//        }

        binding.button2.setOnClickListener{
//            val intent = Intent()
//            intent.putExtra("data_return", "Hello FirstActivity")
//            setResult(RESULT_OK, intent)
//            finish()
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }


    }

    override fun onBackPressed(){
        val intent = Intent()
        intent.putExtra("data_return", "Hello FirstActivity, I'm back")
        setResult(RESULT_OK, intent)
        finish()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("SecondActivity", "onDestroy")
    }
}