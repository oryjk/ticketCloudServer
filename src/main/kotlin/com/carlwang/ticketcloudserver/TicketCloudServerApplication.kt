package com.carlwang.ticketcloudserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TicketCloudServerApplication

fun main(args: Array<String>) {
    runApplication<TicketCloudServerApplication>(*args)
}
