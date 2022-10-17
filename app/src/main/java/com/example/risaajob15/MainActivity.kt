package com.example.risaajob15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Aplikasi Berjalan", Toast.LENGTH_SHORT)

        val tombol = findViewById<Button>(R.id.tombolNama)

        tombol.setOnClickListener {
            Toast.makeText(this, "Lailatul Risa Istifadhoh", Toast.LENGTH_SHORT).show()
        }

        val tombol2 = findViewById<Button>(R.id.tombolKelas)

        tombol2.setOnClickListener {
            Toast.makeText(this, "XI PPLG 1", Toast.LENGTH_SHORT).show()
        }

        val tombol3 = findViewById<Button>(R.id.tombolNIS)

        tombol3.setOnClickListener {
            Toast.makeText(this, "3004", Toast.LENGTH_SHORT).show()
        }
    }
}