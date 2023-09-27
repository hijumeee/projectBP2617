package com.example.projectbp2617

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class arenales2617 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.arenales2617)

        //intent expLicit
        //instance
        val btnLogin:Button = findViewById(R.id.button2)
        val txtUsername: EditText = findViewById(R.id.editTextUsername)
        val txtpassword: EditText = findViewById(R.id.editTextPassword)
        //event btn login clik
        btnLogin.setOnClickListener {
            //validate
            if (txtUsername.text.toString().equals("Dhila") &&
                txtpassword.text.toString().equals("amikom")){
                //call home activity
                val intentHome = Intent(this, HomeActivty::class.java)
                startActivity(intentHome)
            }else{
                Toast.makeText(this,"Uername/Password salah!!!",Toast.LENGTH_SHORT).show()
            }
        }
    }
}