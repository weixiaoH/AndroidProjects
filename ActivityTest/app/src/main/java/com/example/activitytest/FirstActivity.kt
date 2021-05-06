package com.example.activitytest

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import com.example.activitytest.BaseActivity.Companion.actionStart
import com.example.activitytest.databinding.FirstLayoutBinding

class FirstActivity : BaseActivity() {

    private lateinit var binding: FirstLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("FirstActivity", "Task id is $taskId")
        binding = FirstLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button1.setOnClickListener {
//            val intent = Intent(this, SecondActivity::class.java)
//            startActivity(intent)
            Util.doAction2()
            doSomething()
            SecondActivity.actionStart(this, "data1", "data2")
        }

//        binding.button1.setOnClickListener {
//            隐式调用加载activity
//            val intent = Intent("com.example.activitytest.ACTION_START")
//            intent.addCategory("com.example.activitytest.MY_CATEGORY")
//            startActivity(intent)

            //调用安卓原生浏览器loading url
//            val intent = Intent(Intent.ACTION_VIEW)
//            intent.data = Uri.parse("https://www.baidu.com")
//            startActivity(intent)

            //setData Extra for Second
//            val data = "Hello SecondActivity"
//            val intent = Intent(this, SecondActivity::class.java)
//            intent.putExtra("extra_data",data)
//            startActivity(intent)

            //回退传参
//            val intent = Intent(this, SecondActivity::class.java)
//            startActivityForResult(intent, 1)

//        }
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("FirstActivity", "onRestart")
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode){
            1 -> if (resultCode == RESULT_OK){
                val returnedData = data?.getStringExtra("data_return")
                Log.d("FirstAcitvity", "returned data is $returnedData")
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.add_item -> Toast.makeText(this, "You clicked Add", Toast.LENGTH_SHORT).show()
            R.id.remove_item -> Toast.makeText(this, "You clicked Remove",
                Toast.LENGTH_SHORT).show()
        }

        return true
    }
}