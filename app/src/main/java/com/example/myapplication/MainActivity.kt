package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener {
            throw Exception("123")
        }
        btn2.setOnClickListener {
            object : Thread() {
                override fun run() {
                    throw Exception("123")
                }
            }.start()
        }
    }
}
