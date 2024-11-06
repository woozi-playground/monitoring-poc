package com.poc.monitoring.command

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CommandServerApplication

fun main(args: Array<String>) {
    runApplication<CommandServerApplication>(*args)
}
