package no.kotlin.cardgame.enterprise.usercollections.dto

import io.swagger.annotations.ApiModelProperty

class PatchResultDto(

        @get:ApiModelProperty("If a card was opened, specify which cards were in it")
        var cardIdsInOpenedPacket: MutableList<String> = mutableListOf()

)
