package de.fatih_inan.netrunner_deck_builder

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform