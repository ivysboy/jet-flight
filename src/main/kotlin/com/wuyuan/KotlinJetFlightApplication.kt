package com.wuyuan

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ImportResource

@SpringBootApplication
@ImportResource
@EnableApolloConfig("application")
class KotlinJetFlightApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinJetFlightApplication::class.java, *args)
}
