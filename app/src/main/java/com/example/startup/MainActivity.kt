 package com.example.startup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text
import java.util.*

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val  but:Button = findViewById (R.id.bugetage)
        val life:TextView= findViewById(R.id.textView)
         but.setOnClickListener {

             val userODB:EditText = findViewById(R.id.textInput)
             val dude=userODB.text
             val ans= Integer.parseInt(dude.toString())
             val currentyear= Calendar.getInstance().get(Calendar.YEAR)
             val anss= currentyear -ans
             life.text= "Your age is $anss"
         }
    }

}