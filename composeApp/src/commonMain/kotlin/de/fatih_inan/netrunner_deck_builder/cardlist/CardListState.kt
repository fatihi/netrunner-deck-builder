package de.fatih_inan.netrunner_deck_builder.cardlist

import de.fatih_inan.netrunner_deck_builder.models.Card

data class CardListState(
    val cards: List<Card> = listOf(
        Card(
            code = "00005",
            cost = 0,
            deckLimit = 3,
            factionCode = "criminal",
            factionCost = 4,
            illustrator = "Outland Entertainment LLC",
            keywords = "Run - Sabotage",
            packCode = "core",
            position = 18,
            quantity = 2,
            sideCode = "runner",
            strippedText = "Run HQ. If successful, instead of breaching HQ, you may force the Corp to lose up to 5 credits, then you gain 2 credits for each credit lost and take 2 tags.",
            strippedTitle = "Account Siphon",
            text = "Run HQ. If successful, instead of breaching HQ, you may force the Corp to lose up to 5[credit], then you gain 2[credit] for each credit lost and take 2 tags.",
            title = "Account Siphon",
            typeCode = "event",
            uniqueness = false,
        ),
    )
)
