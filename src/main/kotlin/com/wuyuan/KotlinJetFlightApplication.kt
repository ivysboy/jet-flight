package com.wuyuan

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlinJetFlightApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinJetFlightApplication::class.java, *args)
}
