package com.example.uicustomviews

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.uicustomviews.databinding.TitleBinding

class TitleLayout(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {
    private lateinit var titleBinding: TitleBinding
    init {
        LayoutInflater.from(context).inflate(R.layout.title, this)

        val titleBack = findViewById<Button>(R.id.titleBack);
        val titleEdit = findViewById<Button>(R.id.titleEdit);
        titleBack.setOnClickListener {
            val activity = context as Activity
            activity.finish()
        }
        titleEdit.setOnClickListener {
            Toast.makeText(context, "You clicked Edit button", Toast.LENGTH_SHORT).show()
        }

    }
}
