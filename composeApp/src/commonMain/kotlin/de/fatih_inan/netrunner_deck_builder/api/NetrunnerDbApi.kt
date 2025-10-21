package de.fatih_inan.netrunner_deck_builder.api

import de.fatih_inan.netrunner_deck_builder.models.Card
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

private const val API_BASE_URL = "https://netrunnerdb.com/api/2.0/public"

@Serializable
data class CardsResponse(
    @SerialName("imageUrlTemplate")
    val imageUrlTemplate: String,
    @SerialName("data")
    val data: List<Card>
)

class NetrunnerDbApi {
    private val client = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
                isLenient = true
            })
        }
    }

    suspend fun fetchCards(): List<Card> {
        val response = client.get("$API_BASE_URL/cards")
        val cardsResponse: CardsResponse = response.body()
        return cardsResponse.data
    }
}
