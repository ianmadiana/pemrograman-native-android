package com.example.jabarcitylist.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

//kode class ini berfungsi untuk merepresentasikan data
data class JabarCityList(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
    )