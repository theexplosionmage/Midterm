package com.example.midterm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    val btnBuy: Button = findViewById(R.id.buyBtn)
    val id1: EditText = findViewById(R.id.id1)
    val id2: EditText = findViewById(R.id.id2)
    val id3: EditText = findViewById(R.id.id3)
    val id4: EditText = findViewById(R.id.id4)
    val id5: EditText = findViewById(R.id.id5)
    val id6: EditText = findViewById(R.id.id6)

    btnBuy.setOnClickListener{
        try {
            if(id1.text.toString().toFloat() >= 100000 || id1.text.toString().toFloat() <= 0)
                Toast.makeText(this,"Balance out of range",Toast.LENGTH_LONG).show()
        } catch (e: NumberFormatException) {
            Toast.makeText(this,"Invalid Balance Amount",Toast.LENGTH_LONG).show()
        }

        if(id2.text.toString().length > 50 || id2.text.toString().length < 5)
            Toast.makeText(this,"Invalid Name",Toast.LENGTH_LONG).show()
        if(id3.text.toString().length != 16)
            Toast.makeText(this,"Invalid Credit Card Number",Toast.LENGTH_LONG).show()
        if(id4.text.toString().length !=2)
            Toast.makeText(this,"Invalid Month",Toast.LENGTH_LONG).show()
        if(id5.text.toString().length !=2)
            Toast.makeText(this,"Invalid Year",Toast.LENGTH_LONG).show()
        if(id5.text.toString().length !=3)
            Toast.makeText(this,"Invalid CVV Code",Toast.LENGTH_LONG).show()
        Toast.makeText(this,"Success",Toast.LENGTH_SHORT).show()
    }



    }
}