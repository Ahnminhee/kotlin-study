package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_ac.setOnClickListener {
            textBar.text = "0"
        }
        btn_chan.setOnClickListener {
            var sum = textBar.toString()
            if() {

            }
        }
    }
}
