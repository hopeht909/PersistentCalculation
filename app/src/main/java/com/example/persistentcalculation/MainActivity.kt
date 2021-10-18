package com.example.persistentcalculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etDouble : EditText
    lateinit var etFloat : EditText
    lateinit var btMultiply : Button
    lateinit var tv : TextView
     var answer = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etDouble = findViewById(R.id.etDouble)
        etFloat = findViewById(R.id.etFloat)
        btMultiply = findViewById(R.id.btMultiply)
        tv = findViewById(R.id.tv)

        btMultiply.setOnClickListener {
          answer =  etDouble.text.toString().toDouble() * etFloat.text.toString().toFloat()
            tv.text = answer.toString()
        }
    }
}