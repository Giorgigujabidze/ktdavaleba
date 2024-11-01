package com.example.midtermbtueasy

import android.os.Bundle
import android.os.VibrationEffect
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private lateinit var textViewCircle: TextView
    private lateinit var buttonClick: Button
    private var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        textViewCircle = findViewById(R.id.textViewCircle)
        buttonClick = findViewById(R.id.buttonClick)

        buttonClick.setOnClickListener {
            number--
            textViewCircle.text = number.toString()
            buttonClick.performHapticFeedback(VibrationEffect.EFFECT_CLICK)
        }
    }
}
