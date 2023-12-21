package com.example.vortex_baru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Welcome_Screen : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen)

        // Mendapatkan reference dari tombol login dan mendaftarkan listener onClick
        val wbtl: Button = findViewById(R.id.Wloginbt)
        wbtl.setOnClickListener(this)

        // Mendapatkan reference dari tombol register dan mendaftarkan listener onClick
        val wbtr: Button = findViewById(R.id.wrRegisbt)
        wbtr.setOnClickListener(this)
    }

    // Memproses klik tombol
    override fun onClick(v: View?) {
        when (v?.id) {
            // Jika tombol login ditekan, buat intent untuk membuka layar Login
            R.id.Wloginbt -> {
                val intent = Intent(this@Welcome_Screen, Login::class.java)
                startActivity(intent)
            }
            // Jika tombol register ditekan, buat intent untuk membuka layar Register
            R.id.wrRegisbt -> {
                val intent = Intent(this@Welcome_Screen, Register_screen::class.java)
                startActivity(intent)
            }
        }
    }
}
