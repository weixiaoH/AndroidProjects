package com.example.myapplication

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.widget.Toast

class MyApplication : Application() {
    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }
    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

    fun String.showToast(duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(MyApplication.context, this, duration).show()
    }

    fun Int.showToast(duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(MyApplication.context, this, duration).show()
    }

}