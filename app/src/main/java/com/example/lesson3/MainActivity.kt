package com.example.lesson3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var arr = arrayOf("Hamburger", "Pizza", "Mexican", "American", "Chinese")

    fun addbtnClicked(view: View){

        btn1.setOnClickListener{

            arr+= edittext.text.toString()
            edittext.text = null
        }

        btn2.setOnClickListener {
            textview.text = arr[Random.nextInt(arr.size)]
        }

    }

}