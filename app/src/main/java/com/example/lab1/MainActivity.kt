package com.example.lab1


import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.viewModels



class MainActivity : ComponentActivity() {
    private lateinit var myTextView: TextView
    private lateinit var myButton: Button
    private val textViewModel: TextViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myTextView = findViewById(R.id.textView)
        myButton = findViewById(R.id.button2)

        textViewModel.text.observe(this) {
            myTextView.text = it
        }
        myButton.setOnClickListener{
            textViewModel.changeText("New text")
        }
    }

}
