package com.example.vortex_baru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class Login : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Menginisialisasi dan menetapkan listener untuk tombol login
        val btnlogin: Button = findViewById(R.id.llogin)
        btnlogin.setOnClickListener(this)

        // Menginisialisasi dan menetapkan listener untuk teks "Lupa Sandi?"
        val lupasandi: TextView = findViewById(R.id.textView2)
        lupasandi.setOnClickListener(this)

        // Menginisialisasi dan menetapkan listener untuk teks "Belum Punya Akun? Daftar Disini"
        val loginl: TextView =findViewById(R.id.lregis)
        loginl.setOnClickListener(this)

        // Menginisialisasi dan menetapkan listener untuk tombol kembali
        val back : ImageButton = findViewById(R.id.backbutton)
        back.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.llogin ->{
                // Jika tombol login ditekan, buat intent untuk membuka MainActivity
                val intent = Intent(this@Login, MainActivity::class.java)
                startActivity(intent)
            }
            R.id.textView2 ->{
                // Jika teks "Lupa Sandi?" ditekan, buat intent untuk membuka Lupa_sandi Activity
                val intent = Intent(this@Login, Lupa_sandi::class.java)
                startActivity(intent)
            }
            R.id.backbutton ->{
                // Jika tombol kembali ditekan, buat intent untuk kembali ke Welcome_Screen
                val intent = Intent(this@Login, Welcome_Screen::class.java)
                startActivity(intent)
            }
            R.id.Rregis ->{
                // Jika teks "Belum Punya Akun? Daftar Disini" ditekan, buat intent untuk membuka Register_screen
                val intent = Intent(this@Login, Register_screen::class.java)
                startActivity(intent)
            }
        }
    }
}
