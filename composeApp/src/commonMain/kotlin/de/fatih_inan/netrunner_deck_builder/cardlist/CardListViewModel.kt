package de.fatih_inan.netrunner_deck_builder.cardlist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import de.fatih_inan.netrunner_deck_builder.api.NetrunnerDbApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class CardListViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(CardListState())
    val uiState: StateFlow<CardListState> = _uiState.asStateFlow()

    private val api = NetrunnerDbApi()

    init {
        loadCards()
    }

    private fun loadCards() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true, error = null)
            try {
                val cards = api.fetchCards()
                _uiState.value = _uiState.value.copy(
                    cards = cards,
                    isLoading = false
                )
            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(
                    isLoading = false,
                    error = e.message ?: "Unknown error occurred"
                )
            }
        }
    }
}