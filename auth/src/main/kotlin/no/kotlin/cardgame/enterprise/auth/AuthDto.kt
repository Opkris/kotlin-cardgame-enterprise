package no.kotlin.cardgame.enterprise.auth

import javax.validation.constraints.NotBlank


class AuthDto(
        @get:NotBlank
        var userId : String? = null,

        @get:NotBlank
        var password: String? = null
)