package com.example.supermovies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//activity ke-2 pada saat user menekan tombol rating di detail halaman
class RatingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating)

        //blok kode untuk menampilkan back arrow button
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    //fungsi untuk menampilkan back arrow button
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}