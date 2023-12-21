package com.example.vortex_baru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class Lupa_sandi : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lupa_sandi)

        val backls : ImageButton = findViewById(R.id.backbuttonl)
        backls.setOnClickListener(this)

        val confr : Button = findViewById(R.id.Konfirmasi)
        confr.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.backbuttonl ->{
                val intent = Intent(this@Lupa_sandi, Login::class.java)
                startActivity(intent)
            }
            R.id.Konfirmasi ->{
                val intent = Intent(this@Lupa_sandi, codeverivication::class.java)
                startActivity(intent)

            }
        }
    }
}