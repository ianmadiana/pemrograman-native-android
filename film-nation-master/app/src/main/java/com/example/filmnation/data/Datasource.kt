package com.example.filmnation.data

import com.example.filmnation.R
import com.example.filmnation.model.FilmNation

class Datasource {
    fun loadFilmNation(): List<FilmNation> {
        return listOf<FilmNation>(
            FilmNation(R.string.film1, R.drawable.film1_sing2),
            FilmNation(R.string.film2, R.drawable.film2_the355),
            FilmNation(R.string.film3, R.drawable.film3_scream),
            FilmNation(R.string.film4, R.drawable.film4_nightmare_alley),
            FilmNation(R.string.film5, R.drawable.film5_morbius),
            FilmNation(R.string.film6, R.drawable.film6_death_on_the_nile),
            FilmNation(R.string.film7, R.drawable.film7_uncharted),
            FilmNation(R.string.film8, R.drawable.film8_the_batman),
            FilmNation(R.string.film9, R.drawable.film9_turning_red),
            FilmNation(R.string.film10, R.drawable.film10_downton_abbey_a_new_era)
        )
    }
}