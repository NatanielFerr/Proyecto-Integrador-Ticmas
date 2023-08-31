package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var editText1: EditText
    private lateinit var editText2: EditText
    private lateinit var compareButton: Button
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText1 = findViewById(R.id.editText1)
        editText2 = findViewById(R.id.editText2)
        compareButton = findViewById(R.id.buttonCompare)
        resultTextView = findViewById(R.id.textResult)

        compareButton.setOnClickListener {
            val text1 = editText1.text.toString()
            val text2 = editText2.text.toString()

            val result = if (text1 != text2) {
                "Los textos no son iguales"
            } else {
                "Los textos son iguales"
            }

            resultTextView.text = result
        }
    }
}
