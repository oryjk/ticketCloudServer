package com.carlwang.ticketcloudserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class TicketCloudServerApplication

fun main(args: Array<String>) {
    runApplication<TicketCloudServerApplication>(*args)
}
