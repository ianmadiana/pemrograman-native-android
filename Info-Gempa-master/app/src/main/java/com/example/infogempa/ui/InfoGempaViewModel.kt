package com.example.infogempa.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.infogempa.network.InfoGempa
import com.example.infogempa.network.InfoGempaApi
import kotlinx.coroutines.launch

enum class InfoGempaApiStatus {LOADING, ERROR, DONE}

class InfoGempaViewModel :ViewModel() {

    private val _status = MutableLiveData<InfoGempaApiStatus>()

    val status: LiveData<InfoGempaApiStatus> = _status

    private val _infos =MutableLiveData<List<InfoGempa>>()
    val infos: LiveData<List<InfoGempa>> = _infos

    private val _info =MutableLiveData<InfoGempa>()
    val info: LiveData<InfoGempa> = _info

    fun getInfoGempaList() {
        _status.value = InfoGempaApiStatus.LOADING
        viewModelScope.launch {
            try {
                _infos.value = InfoGempaApi.retrofitService.getInfoGempa()
                _status.value = InfoGempaApiStatus.DONE
            } catch (e: Exception) {
                _infos.value = emptyList()
                _status.value = InfoGempaApiStatus.ERROR
            }
        }
    }

    fun onInfoGempaClicked(infogempa: InfoGempa) {
        _info.value = infogempa
    }
}