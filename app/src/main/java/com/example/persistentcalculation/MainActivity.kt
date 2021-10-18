package com.example.persistentcalculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

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
            try {
                answer = etDouble.text.toString().toDouble() * etFloat.text.toString().toFloat()
                tv.text = answer.toString()
            }
            catch(e : NumberFormatException){
                Toast.makeText(this, "invalid! please enter a number" ,Toast.LENGTH_LONG).show()
            }
        }
    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putDouble("myAnswer", answer)

}
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
       val answerS= savedInstanceState.getDouble("myAnswer", 0.0)
        answer= answerS
        tv.text = answer.toString()


    }

}