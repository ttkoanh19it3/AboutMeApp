package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener  {

    lateinit var editTextTextPersonName: EditText
    lateinit var button: Button
    lateinit var textView1 : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextTextPersonName =findViewById(R.id.editTextTextPersonName)
        button =findViewById(R.id.button)
        textView1= findViewById(R.id.textView1)

        button.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        var name = editTextTextPersonName.text
        textView1.text="$name"
    }
}