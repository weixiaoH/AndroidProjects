package com.example.jetpacktest

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class MainViewModel(countReserved: Int) : ViewModel() {
<<<<<<< HEAD
    val counter: LiveData<Int>
        get() = _counter

    private val _counter = MutableLiveData<Int>()
=======

    val userLiveData = MutableLiveData<User>()

    fun getUser(userId: String): LiveData<User> {
        return Repository.getUser(userId)
    }
>>>>>>> 48b5ec9 (stash)

    private val userIdLiveData = MutableLiveData<String>()

    val user: LiveData<User> = Transformations.switchMap(userIdLiveData) { userId ->
        Repository.getUser(userId)
    }

<<<<<<< HEAD
=======
    val userName: LiveData<String> = Transformations.map(userLiveData) { user ->
        "${user.firstName} ${user.lastName}"
    }

    val counter: LiveData<Int>
        get() = _counter

    private val _counter = MutableLiveData<Int>()

>>>>>>> 48b5ec9 (stash)
    init {
        _counter.value = countReserved
    }

    fun plusOne() {
        val count = _counter.value ?: 0
        _counter.value = count + 1
    }

    fun clear() {
        _counter.value = 0
<<<<<<< HEAD
    }

    fun getUser(userId: String) {
        userIdLiveData.value = userId
=======
>>>>>>> 48b5ec9 (stash)
    }
}
