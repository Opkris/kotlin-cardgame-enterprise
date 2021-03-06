package no.kotlin.cardgame.enterprise.usercollections

import no.kotlin.cardgame.enterprise.usercollections.Application
import org.springframework.boot.SpringApplication


fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, "--spring.profiles.active=test")
}