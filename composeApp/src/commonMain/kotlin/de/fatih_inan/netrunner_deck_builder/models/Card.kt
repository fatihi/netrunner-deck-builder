package de.fatih_inan.netrunner_deck_builder.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Card(
    @SerialName("advancement_cost")
    val advancementCost: Int?,
    @SerialName("agenda_points")
    val agendaPoints: Int?,
    @SerialName("base_link")
    val baseLink: Int?,
    @SerialName("code")
    val code: String,
    @SerialName("cost")
    val cost: Int?,
    @SerialName("deck_limit")
    val deckLimit: Int,
    @SerialName("faction_code")
    val factionCode: String,
    @SerialName("faction_cost")
    val factionCost: Int,
    @SerialName("flavor")
    val flavor: String?,
    @SerialName("illustrator")
    val illustrator: String?,
    @SerialName("influence_limit")
    val influenceLimit: Int,
    @SerialName("keywords")
    val keywords: String?,
    @SerialName("memory_cost")
    val memoryCost: Int?,
    @SerialName("minimum_deck_size")
    val minimumDeckSize: Int?,
    @SerialName("pack_code")
    val packCode: String,
    @SerialName("position")
    val position: Int,
    @SerialName("quantity")
    val quantity: Int,
    @SerialName("side_code")
    val sideCode: String,
    @SerialName("strength")
    val strength: String?,
    @SerialName("stripped_text")
    val strippedText: String?,
    @SerialName("stripped_title")
    val strippedTitle: String,
    @SerialName("text")
    val text: String?,
    @SerialName("title")
    val title: String,
    @SerialName("trash_cost")
    val trashCost: Int?,
    @SerialName("type_code")
    val typeCode: String,
    @SerialName("uniqueness")
    val uniqueness: Boolean,
)
