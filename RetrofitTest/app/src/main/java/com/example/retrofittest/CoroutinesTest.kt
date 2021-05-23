package com.example.retrofittest

import kotlinx.coroutines.*

fun main() {
//    runBlocking {
//        launch {
//            println("launch1")
//            delay(1000)
//            println("launch1 finished")
//        }
//        launch {
//            println("launch2")
//            delay(1000)
//            println("launch2 finished")
//        }
//    }

//    val start = System.currentTimeMillis()
//    runBlocking {
//        repeat(100000) {
//            launch {
//                println(".")
//            }
//        }
//    }
//    val end = System.currentTimeMillis()
//    println(end - start)

//    runBlocking {
//        coroutineScope {
//            launch {
//                for (i in 1..10) {
//                    println(i)
//                    delay(1000)
//                }
//            }
//        }
//        println("coroutineScope finished")
//    }
//    println("runBlocking finished")
//
//    runBlocking {
//        val result = async {
//            5 + 5
//        }.await()
//        println(result)
//    }

//    runBlocking {
//        val start = System.currentTimeMillis()
//        val result1 = async {
//            delay(1000)
//            5 + 5
//        }.await()
//        val result2 = async {
//            delay(1000)
//            4 + 6
//        }.await()
//        println("result is ${result1 + result2}.")
//        val end = System.currentTimeMillis()
//        println("cost ${end - start} ms.")
//    }

//    runBlocking {
//        val start = System.currentTimeMillis()
//        val deferred1 = async {
//            delay(1000)
//            5 + 5
//        }
//        val deferred2 = async {
//            delay(1000)
//            4 + 6
//        }
//        println("result is ${deferred1.await() + deferred2.await()}.")
//        val end = System.currentTimeMillis()
//        println("cost ${end - start} milliseconds.")
//    }

    runBlocking {
        val result = withContext(Dispatchers.Default) {
            5 + 5
        }
        println(result)
    }



}

suspend fun printDot() = coroutineScope {
    launch {
        println(".")
        delay(1000)
    }
}

