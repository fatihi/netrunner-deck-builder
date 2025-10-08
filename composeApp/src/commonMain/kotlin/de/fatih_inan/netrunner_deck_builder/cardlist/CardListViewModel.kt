package de.fatih_inan.netrunner_deck_builder.cardlist

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class CardListViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(CardListState())
    val uiState: StateFlow<CardListState> = _uiState.asStateFlow()
}