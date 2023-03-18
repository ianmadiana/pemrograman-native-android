package com.example.filmnation.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class FilmNation (
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int) {
}