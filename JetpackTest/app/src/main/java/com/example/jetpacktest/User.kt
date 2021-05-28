package com.example.jetpacktest

<<<<<<< HEAD
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(var firstName: String, var lastName: String, var age: Int) {
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
}
=======
data class User(var firstName: String, var lastName: String, var age: Int)
>>>>>>> 48b5ec9 (stash)
