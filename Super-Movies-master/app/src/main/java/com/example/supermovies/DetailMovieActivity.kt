package com.example.supermovies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

//class yang akan utama yang akan dijalankan
class DetailMovieActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_movie)

        //blok kode untuk ke activity rating dengan button
        val ratingBtn = findViewById<Button>(R.id.ratingBtn)
        ratingBtn.setOnClickListener {
            val intent = Intent(this, RatingActivity::class.java)
            startActivity(intent)
        }

        //library untuk back arrow button
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        //variabel untuk intent
        val supermovies = intent.getParcelableExtra<Movies>(MainActivity.INTENT_PARCELABLE)

        val imgMovie = findViewById<ImageView>(R.id.img_item_photo)
        val titleMovie = findViewById<TextView>(R.id.tv_item_name)
        val descMovie = findViewById<TextView>(R.id.tv_item_description)

        //tampilkan data ke view
        imgMovie.setImageResource(supermovies?.imgMovie!!)
        titleMovie.text = supermovies.titleMovie
        descMovie.text = supermovies.descMovie

    }

    //fungsi untuk menampilkan back arrow button
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}