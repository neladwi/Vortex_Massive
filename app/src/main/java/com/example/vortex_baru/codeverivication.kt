package com.example.vortex_baru

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView

class codeverivication : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_codeverivication)

        val mytable: TableLayout = findViewById(R.id.table_ly)

        // Misalkan email telah terverifikasi
        val verifiedEmail = "1234" //  hanya 4 angka dari email
        populateBoxes(mytable, verifiedEmail)
    }

    private fun populateBoxes(tableLayout: TableLayout, email: String) {
        val tableRow = TableRow(this)

        val boxSize = 120
        val marginBetweenBoxes = 10

        for (i in 0 until 4) {
            val textView = TextView(this)

            val layoutParams = TableRow.LayoutParams(
                boxSize,
                boxSize
            )

            layoutParams.setMargins(
                marginBetweenBoxes, // Margin kiri
                0,
                0,
                0
            )

            textView.layoutParams = layoutParams

            textView.gravity = Gravity.CENTER
            textView.setBackgroundResource(R.drawable.boxemail)

            textView.text = email[i].toString()

            tableRow.addView(textView)
        }

        tableLayout.addView(tableRow)
    }
}


