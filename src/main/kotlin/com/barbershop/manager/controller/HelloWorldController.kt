package com.barbershop.manager.controller

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @GetMapping("/")
    fun helloWorld(): String {
        log.info("Returning hello world.")
        return "Hello World!"
    }

    companion object {
        var log: Logger = LoggerFactory.getLogger(HelloWorldController::class.java)
    }
}
