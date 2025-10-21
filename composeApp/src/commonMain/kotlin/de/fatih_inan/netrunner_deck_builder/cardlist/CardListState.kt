package de.fatih_inan.netrunner_deck_builder.cardlist

import de.fatih_inan.netrunner_deck_builder.models.Card

data class CardListState(
    val cards: List<Card> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
)
