package de.fatih_inan.netrunner_deck_builder

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import de.fatih_inan.netrunner_deck_builder.cardlist.CardList
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        CardList()
    }
}