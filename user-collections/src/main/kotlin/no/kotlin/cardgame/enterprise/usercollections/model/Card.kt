package no.kotlin.cardgame.enterprise.usercollections.model

import no.enterprise.kotlin.cardgame.cards.dto.CardDto
import no.enterprise.kotlin.cardgame.cards.dto.Rarity

data class Card(
        val cardId : String,
        val rarity: Rarity
){

    constructor(dto: CardDto): this(
            dto.cardId ?: throw IllegalArgumentException("Null cardId"),
            dto.rarity ?: throw IllegalArgumentException("Null rarity"))
}