package com.example.providertest

import kotlin.reflect.KProperty

//class MySet<T>(val helperSet: HashSet<T>) : Set<T> {
//    override val size: Int
//        get() = helperSet.size
//    override fun contains(element: T) = helperSet.contains(element)
//    override fun containsAll(elements: Collection<T>) = helperSet.containsAll(elements)
//    override fun isEmpty() = helperSet.isEmpty()
//    override fun iterator() = helperSet.iterator()
//}

class MySet<T>(val helperSet: HashSet<T>) : Set<T> by helperSet {
    fun helloWorld() = println("Hello World")
    override fun isEmpty() = false
}

class MyClass {
    var p by Delegate()
}

class Delegate {
    var propValue: Any? = null
    operator fun getValue(myClass: MyClass, prop: KProperty<*>): Any? {
        return propValue
    }
    operator fun setValue(myClass: MyClass, prop: KProperty<*>, value: Any?) {
        propValue = value
    }
}
