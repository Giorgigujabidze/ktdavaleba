package com.example.midtermbtueasy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    private lateinit var editTextNumber: EditText
    private lateinit var textViewNumber: TextView
    private lateinit var buttonOkay: Button
    private lateinit var buttonNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextNumber = findViewById(R.id.editTextNumber)
        textViewNumber = findViewById(R.id.textViewNumber)
        buttonOkay = findViewById(R.id.buttonOkay)
        buttonNext = findViewById(R.id.buttonNext)

        buttonOkay.setOnClickListener {
            val number = editTextNumber.text.toString()
            textViewNumber.text = "your number is $number"
        }

        buttonNext.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}
