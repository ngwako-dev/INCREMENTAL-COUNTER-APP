package com.incremental_counter

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.abs

class MainActivity : AppCompatActivity() {

    //default value
   private var  initialValue=0

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Counter starting at the default value
        textViewOutput.text = "$initialValue"

        //increment button method
        button1.setOnClickListener {
            textViewOutput.text = ""+(editTextUserInput.text.toString().toInt()+textViewOutput.text.toString().toInt())
        }

        //decrement button method
        button2.setOnClickListener {
            textViewOutput.text=""+ abs(textViewOutput.text.toString().toInt()-editTextUserInput.text.toString().toInt())
        }
    }
}
