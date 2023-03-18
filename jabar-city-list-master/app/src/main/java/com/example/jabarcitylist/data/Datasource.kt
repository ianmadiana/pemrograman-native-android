package com.example.jabarcitylist.data

import com.example.jabarcitylist.R
import com.example.jabarcitylist.model.JabarCityList


//Membuat class yang akan manjadi sumber data yang akan ditampilkan
class Datasource {
    // fungsi untuk membuat list data yang akan ditampilkan
    fun loadJabarCityList(): List<JabarCityList> {
        return listOf<JabarCityList>(
            JabarCityList(R.string.kab_bandung, R.drawable.kabupaten_bandung),
            JabarCityList(R.string.kab_bandung_barat, R.drawable.kab_bandung_barat),
            JabarCityList(R.string.kab_bekasi, R.drawable.kabupaten_bekasi),
            JabarCityList(R.string.kab_bogor, R.drawable.kabupaten_bogor_svg),
            JabarCityList(R.string.kab_ciamis, R.drawable.kab_ciamis_svg),
            JabarCityList(R.string.kab_cianjur, R.drawable.kabupaten_cianjur),
            JabarCityList(R.string.kab_cirebon, R.drawable.kab_cirebon),
            JabarCityList(R.string.kab_garut, R.drawable.kabupaten_garut),
            JabarCityList(R.string.kab_indramayu, R.drawable.kabupaten_indramayu),
            JabarCityList(R.string.kab_karawang, R.drawable.kabupaten_karawang_svg),
            JabarCityList(R.string.kab_kuningan, R.drawable.kab_kuningan),
            JabarCityList(R.string.kab_majalengka, R.drawable.kabupaten_majalengka_svg),
            JabarCityList(R.string.kab_pangandaran, R.drawable.pangandaran),
            JabarCityList(R.string.kab_purwakarta, R.drawable.kabupaten_purwakarta),
            JabarCityList(R.string.kab_subang, R.drawable.kabupaten_subang),
            JabarCityList(R.string.kab_sukabumi, R.drawable.kab_sukabumi_svg),
            JabarCityList(R.string.kab_sumedang, R.drawable.sumedang_regency),
            JabarCityList(R.string.kab_tasimalaya, R.drawable.kabupaten_tasikmalaya),
            JabarCityList(R.string.kot_bandung, R.drawable.kota_bandung),
            JabarCityList(R.string.kot_banjar, R.drawable.logo_kota_banjar),
            JabarCityList(R.string.kot_bekasi, R.drawable.bekasi),
            JabarCityList(R.string.kot_bogor, R.drawable.bogor_svg),
            JabarCityList(R.string.kot_cimahi, R.drawable.kota_cimahi),
            JabarCityList(R.string.kot_cirebon, R.drawable.kota_cirebon),
            JabarCityList(R.string.kot_depok, R.drawable.depok_city_svg),
            JabarCityList(R.string.kot_sukabumi, R.drawable.kota_sukabumi),
            JabarCityList(R.string.kot_tasik, R.drawable.kota_tasikmalaya)
        )
    }
}