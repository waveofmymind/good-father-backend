package com.goodfather.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestApi {

    @GetMapping("/test")
    fun test(): String {
        return "Hello World!"
    }
}
