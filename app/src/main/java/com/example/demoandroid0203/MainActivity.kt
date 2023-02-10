package com.example.demoandroid0203

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var rightNumber = 0
    var leftNumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resetNumbers()
    }
    fun doClick(button:View) {
        if(button.id==R.id.btnLeft && rightNumber < leftNumber)
            Toast.makeText(this, "You win!!", Toast.LENGTH_LONG).show()
        else if(button.id==R.id.btnRight && rightNumber > leftNumber)
            Toast.makeText(this, "You win!!", Toast.LENGTH_LONG).show()
        else
            Toast.makeText(this, "Try again", Toast.LENGTH_LONG).show()
        resetNumbers()
    }

    fun resetNumbers() {
        rightNumber = Random.nextInt(0,100)
        leftNumber = (0..100).random()
    }
}