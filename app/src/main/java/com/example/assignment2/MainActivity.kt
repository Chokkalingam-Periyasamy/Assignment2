package com.example.assignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    var count = mutableMapOf<String,Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickBtn = findViewById<TextView>(R.id.clickBtn)
        val clickView = findViewById<TextView>(R.id.clickView)
        //val usernameTextInputView = findViewById<TextInputLayout>(R.id.nameText)
        val name = findViewById<TextInputLayout>(R.id.nameText)

        clickBtn.setOnClickListener {
          val userName =name.editText?.text?.toString()
            val finalUserName =
                if(userName.isNullOrEmpty())"Someone"
                else userName

            val oldCount = count[finalUserName]?:0
            val newCount = oldCount+1

            count[finalUserName]=newCount

            clickView.text= " $finalUserName Clicked $newCount times"
        }
    }
}