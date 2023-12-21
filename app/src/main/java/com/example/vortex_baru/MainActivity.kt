package com.example.vortex_baru

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.example.vortex_baru.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Home()) // Menetapkan Fragment Home sebagai default saat Activity dimuat pertama kali

        // Mengatur listener untuk bottom navigation
        binding.butomnav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.Home_buttom -> {
                    replaceFragment(Home()) // Ganti Fragment ke Home jika tombol Home dipilih
                    // Mengubah warna ikon dan teks tombol Home
                    val browncolor = ContextCompat.getColorStateList(this, R.color.buttomclickr)
                    binding.butomnav.itemIconTintList = browncolor
                    binding.butomnav.itemTextColor = browncolor
                }
                R.id.menu -> {
                    replaceFragment(Menu()) // Ganti Fragment ke Menu jika tombol Menu dipilih
                    // Mengubah warna ikon dan teks tombol Menu
                    binding.butomnav.itemIconTintList = ContextCompat.getColorStateList(this, R.color.buttomclickr)
                    binding.butomnav.itemTextColor = ContextCompat.getColorStateList(this, R.color.buttomclickr)
                }
                R.id.chat -> {
                    replaceFragment(Chat()) // Ganti Fragment ke Chat jika tombol Chat dipilih
                    // Mengubah warna ikon dan teks tombol Chat
                    binding.butomnav.itemIconTintList = ContextCompat.getColorStateList(this, R.color.buttomclickr)
                    binding.butomnav.itemTextColor = ContextCompat.getColorStateList(this, R.color.buttomclickr)
                }
                R.id.profile -> {
                    replaceFragment(Profile()) // Ganti Fragment ke Profile jika tombol Profile dipilih
                    // Mengubah warna ikon dan teks tombol Profile
                    binding.butomnav.itemIconTintList = ContextCompat.getColorStateList(this, R.color.buttomclickr)
                    binding.butomnav.itemTextColor = ContextCompat.getColorStateList(this, R.color.buttomclickr)
                }
                else -> {
                    // Tidak ada tindakan jika tombol lainnya dipilih
                }
            }
            true
        }
    }

    // Fungsi untuk mengganti Fragment di dalam container layout
    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.layout_fr, fragment) // Mengganti Fragment yang ada di layout_fr dengan Fragment baru
        fragmentTransaction.commit() // Menyelesaikan transaksi Fragment
    }
}
