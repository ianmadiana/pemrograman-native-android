package com.example.infogempa.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import retrofit2.http.GET

private const val BASE_URL = "https://data.bmkg.go.id/DataMKG/TEWS/"
private val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

interface InfoGempaApiService {
    @GET("https://data.bmkg.go.id/DataMKG/TEWS/gempadirasakan.json")
    suspend fun getInfoGempa(): List<InfoGempa>
}

object InfoGempaApi {
    val retrofitService: InfoGempaApiService by lazy { retrofit.create(InfoGempaApiService::class.java) }
}
