package com.example.room.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.room.repositori.RepositoriSiswa
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.flow.map

class DetailViewModel(
    savedStateHandle: SavedStateHandle,
    private val repositoriSiswa: RepositoriSiswa) : ViewModel {

    private val IdSiswa: Int = checkNotNull(savedStateHandle[DetailSiswaDestination.IdSiswaArg])

    val uiDetailViewModel: StateFlow<DetailSiswaUiState> =
        repositoriSiswa.getSiswaStream(IdSiswa)
            .filterNotNull()
            .map {

            }

}