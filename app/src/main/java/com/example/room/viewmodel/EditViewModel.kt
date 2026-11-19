package com.example.room.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.room.repositori.RepositoriSiswa
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch

class EditViewModel(
    savedStateHandle: SavedStateHandle,
    private val repositoriSiswa: RepositoriSiswa) : ViewModel(){

    var uiStateSiswa by mutableStateOf(UIStateSiswa())
    private set

    private val idSiswa : Int = checkNotNull(savedStateHandle[DetailSiswaDestination.IdSiswaArg])
    init{
        viewModelScope.launch {
            repositoriSiswa.getSiswaStream(idSiswa)
                .filterNotNull()
                .first()
                .toUIStateSiswa(isEntryValid = true)
        }
    }
}
