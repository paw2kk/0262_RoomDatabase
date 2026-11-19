package com.example.room.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.room.repositori.RepositoriSiswa

class DetailViewModel(
    savedStateHandle: SavedStateHandle,
    private val repositoriSiswa: RepositoriSiswa) : ViewModel {

    private val IdSiswa: Int = checkNotNull(savedStateHandle[DetailSiswaDestination.IdSiswaArg])

}