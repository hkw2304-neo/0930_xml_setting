package com.hkw.a0930_xml_setting.view_model

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class HomeViewState(
    val userName: String = "",
)

class HomeViewModel: ViewModel(){
    private val _uiState = MutableStateFlow(HomeViewState())
    val uiState = _uiState.asStateFlow()

    init {
        _uiState.update { it.copy(userName = "test") }
    }
}