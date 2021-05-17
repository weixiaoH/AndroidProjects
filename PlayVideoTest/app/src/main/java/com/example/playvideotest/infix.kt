package com.example.playvideotest

import android.util.Log


infix fun String.beginsWith(prefix: String) = startsWith(prefix)

infix fun <T> Collection<T>.has(element: T) = contains(element)

infix fun <A, B> A.with(that: B) : Pair<A, B> = Pair(this, that)

fun main(){
    if ("Hello Kotlin" beginsWith "Hello") {
        // 处理具体的逻辑
        println("111")
    }

    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
    if (list has "Banana") {
        // 处理具体的逻辑
        println("222")
    }

    val map = mapOf("apple" with 1, "Banana" with 2, "Orange" with 3, "Pear" with 4,
        "Grape" with 5)
}