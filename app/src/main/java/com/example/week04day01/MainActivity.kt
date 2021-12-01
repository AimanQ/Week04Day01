package com.example.week04day01

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    var editTextPhone:EditText?= null
    var buttonLogin:Button?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        connectViews()
        openActivity() //Explicit Intent

    }
    private fun connectViews(){
        editTextPhone = findViewById(R.id.etPhone)
        buttonLogin = findViewById(R.id.btnLogin)
    }

    private fun openActivity(){
        buttonLogin?.setOnClickListener {
            val phoneText = editTextPhone?.text.toString()
            val i = Intent(this,SecondActivity::class.java)
            //                 TAG      VALUE
            i.putExtra("phone",phoneText)
            startActivity(i)

        }
    }


}