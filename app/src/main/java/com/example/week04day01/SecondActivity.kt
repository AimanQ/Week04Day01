package com.example.week04day01

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private var textView:TextView?= null
    private var buttonOpenDial:Button?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        connectViews()
        receiveVariables()
        openDial()
    }
    private fun connectViews(){
        textView = findViewById(R.id.tvPhone)
        buttonOpenDial = findViewById(R.id.btnOpenDialer)

    }
    private fun receiveVariables(){
        val i = intent
        //                                          TAG
        val phoneNumber = i.getStringExtra("phone")
        textView?.setText(phoneNumber)
    }
    private fun openDial(){
        buttonOpenDial?.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL)
            i.data = Uri.parse("tel:${textView?.text}")
            startActivity(i)
        }
    }
}