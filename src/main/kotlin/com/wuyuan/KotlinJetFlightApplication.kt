package com.wuyuan

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ImportResource

@SpringBootApplication
@ImportResource
class KotlinJetFlightApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinJetFlightApplication::class.java, *args)
}
