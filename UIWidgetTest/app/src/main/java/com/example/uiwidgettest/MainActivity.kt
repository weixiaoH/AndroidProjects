package com.example.uiwidgettest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.uiwidgettest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

//        binding.button.setOnClickListener {
//
//            val inputText = binding.editText.text.toString()
//            Log.d("123",inputText)
//            Toast.makeText(this, inputText, Toast.LENGTH_SHORT).show()
//        }
//        binding.button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
//            R.id.button -> {
////                val inputText = binding.editText.text.toString()
////                Log.d("123",inputText)
////                Toast.makeText(this, inputText, Toast.LENGTH_SHORT).show()
//
////                binding.imageView.setImageResource(R.drawable.img_2)
////                if (binding.progressBar.visibility == View.VISIBLE) {
////                    binding.progressBar.visibility = View.GONE
////                } else {
////                    binding.progressBar.visibility = View.VISIBLE
////                }
//
//                AlertDialog.Builder(this).apply {
//                    setTitle("This is Dialog")
//                    setMessage("Something important.")
//                    setCancelable(false)
//                    setPositiveButton("OK") { dialog, which ->
//                    }
//                    setNegativeButton("Cancel") { dialog, which ->
//                    }
//                    show()
//                }
//
//
//            }
        }
    }
}