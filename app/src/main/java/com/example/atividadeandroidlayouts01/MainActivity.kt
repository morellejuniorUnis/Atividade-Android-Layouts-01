package com.example.atividadeandroidlayouts01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            val btnLogin = findViewById<Button>(R.id.btnLogin)

            btnLogin.setOnClickListener(View.OnClickListener {

                val intent = Intent(this, SegundTelaActivity::class.java)

                startActivity(intent)
            })
        }
}