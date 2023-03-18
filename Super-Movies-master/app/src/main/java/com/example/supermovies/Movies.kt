package com.example.supermovies

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

//struktur model untuk aplikasi Super Movies
//Model terdiri dari gambar film (imgMovie), judul film (titleMovie), dan deskripsi film (descMovie)
//menggunakan library parcelize
@Parcelize
data class Movies(
    val imgMovie: Int,
    val titleMovie: String,
    val descMovie: String
) : Parcelable
