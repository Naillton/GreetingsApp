package com.example.greetingsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tView: TextView = findViewById(R.id.textView)
        val edt: EditText = findViewById(R.id.editTextTextPersonName)
        val btn: Button = findViewById(R.id.button)

        btn.setOnClickListener {
            var result: String = "Por favor insira o seu nome no campo acima"
            val textF: String = edt.text.toString()
            if (textF.isNotEmpty()) {
                result = "Ola $textF, seja bem vindo!!!"
            }
            tView.text = result
        }
    }
}