package com.example.wisataindonesia

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.wisataindonesia.R.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        //button1
        val tombol1: Button = findViewById(id.button)
        tombol1.setOnClickListener(this)

        val tombol2: Button = findViewById(id.button2)
        tombol2.setOnClickListener(this)

        val tombol3: Button = findViewById(id.button3)
        tombol3.setOnClickListener(this)

        val tombol4: Button = findViewById(id.button4)
        tombol4.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.button -> {
                val page1 = Intent (this, DetailActivity1::class.java)
                startActivity(page1)
            }

            R.id.button2 -> {
                val page2 = Intent (this, DetailActivity1::class.java)
                startActivity(page2)
            }

            R.id.button3 -> {
                val page3 = Intent (this, DetailActivity3::class.java)
                startActivity(page3)
            }

            R.id.button4 -> {
                val page4 = Intent (this, DetailActivity4::class.java)
                startActivity(page4)
            }
        }
    }
}