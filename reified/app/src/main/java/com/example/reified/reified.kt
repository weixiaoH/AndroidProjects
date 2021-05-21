package com.example.reified

import android.content.Context
import android.content.Intent

class reified {
}

inline fun <reified T> getGenericType() = T::class.java

inline fun <reified T> startActivity(context: Context, block: Intent.() -> Unit) {
    val intent = Intent(context, T::class.java)
    intent.block()
    context.startActivity(intent)
}

fun main(){
    val result1 = getGenericType<String>()
    val result2 = getGenericType<Int>()
    println("result1 is $result1")
    println("result2 is $result2")

//    startActivity<TestActivity>(context) {
//        putExtra("param1", "data")
//        putExtra("param2", 123)
//    }
}