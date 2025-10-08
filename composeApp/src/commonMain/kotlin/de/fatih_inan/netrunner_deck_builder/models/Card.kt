package de.fatih_inan.netrunner_deck_builder.models

data class Card(
    val code: String,
    val title: String,
    val text: String,
    val typeCode: String,
    val uniqueness: Boolean,
)
