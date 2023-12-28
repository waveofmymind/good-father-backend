package com.goodfather

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GoodFatherBackendApplication

fun main(args: Array<String>) {
    runApplication<GoodFatherBackendApplication>(*args)
}
