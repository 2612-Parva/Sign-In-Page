package com.example.signin

import android.R
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton


class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.UPSIDE_DOWN_CAKE)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_item)


        val username1 = findViewById<View>(R.id.bold) as TextView
        val password = findViewById<View>(R.id.cut) as TextView

        val loginbtn = findViewById<View>(R.id.paste) as MaterialButton

        //admin and admin
        loginbtn.setOnClickListener {
            if (username1.text.toString() == "admin" && password.text.toString() == "admin") {
                //correct
                Toast.makeText(
                    this@MainActivity,
                    "LOGIN SUCCESSFUL",
                    Toast.LENGTH_SHORT
                ).show()
            } else  //incorrect
                Toast.makeText(
                    this@MainActivity,
                    "LOGIN FAILED !!!",
                    Toast.LENGTH_SHORT
                ).show()
        }
    }
}