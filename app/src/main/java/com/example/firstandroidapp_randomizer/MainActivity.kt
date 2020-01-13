package com.example.firstandroidapp_randomizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //where layout is connected to activity
        val rollButton = findViewById<Button>(R.id.rollButton) //finds rollbutton and sets it to val
        val resultsTextView = findViewById<TextView>(R.id.result)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)

        rollButton.setOnClickListener { //makes something happen when user clicks on button
            val random_number = Random.nextInt(seekBar.progress) + 1 //generates a number between 0 and value of seekbar, add 1 so it includes 10
            resultsTextView.text = random_number.toString() //convert int to string
        }
    }
}
