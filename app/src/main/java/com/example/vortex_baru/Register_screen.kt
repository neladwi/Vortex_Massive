package com.example.vortex_baru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class Register_screen : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Mendapatkan reference dari tombol register dan mendaftarkan listener onClick
        val butonregister: Button = findViewById(R.id.Rregis)
        butonregister.setOnClickListener(this)

        // Mendapatkan reference dari tombol kembali dan mendaftarkan listener onClick
        val imagebtn: ImageButton = findViewById(R.id.backbuttonr)
        imagebtn.setOnClickListener(this)

        // Mendapatkan reference dari teks "Login" dan mendaftarkan listener onClick
        val loginnbt: TextView = findViewById(R.id.Rlogin)
        loginnbt.setOnClickListener(this)
    }

    // Menangani klik pada elemen tampilan
    override fun onClick(v: View?) {
        when (v?.id) {
            // Jika tombol register ditekan, buat intent untuk membuka MainActivity
            R.id.Rregis -> {
                val intent = Intent(this@Register_screen, MainActivity::class.java)
                startActivity(intent)
            }
            // Jika tombol kembali ditekan, buat intent untuk kembali ke Welcome_Screen
            R.id.backbuttonr -> {
                val intent = Intent(this@Register_screen, Welcome_Screen::class.java)
                startActivity(intent)
            }
            // Jika teks "Login" ditekan, buat intent untuk membuka layar Login
            R.id.Rlogin -> {
                val intent = Intent(this@Register_screen, Login::class.java)
                startActivity(intent)
            }
        }
    }
}
