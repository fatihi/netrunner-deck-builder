package de.fatih_inan.netrunner_deck_builder.cardlist

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import netrunner_deck_builder.composeapp.generated.resources.Res
import netrunner_deck_builder.composeapp.generated.resources.corpid
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun CardList(
    viewModel: CardListViewModel = viewModel { CardListViewModel() },
) {
    val state by viewModel.uiState.collectAsState()
    LazyColumn(
        modifier = Modifier
            .safeContentPadding()
            .fillMaxSize(),
    ) {
        state.cards.map { c ->
            item {
                Row(
                    modifier = Modifier
                        .border(2.dp, Color.Black)
                ) {
                    Image(
                        painter = painterResource(Res.drawable.corpid),
                        contentDescription = null,
                        modifier = Modifier
                            .height(50.dp)
                            .align(Alignment.CenterVertically)
                    )
                    Column {
                        Text(c.title)
                    }
                }
            }
        }
    }
}