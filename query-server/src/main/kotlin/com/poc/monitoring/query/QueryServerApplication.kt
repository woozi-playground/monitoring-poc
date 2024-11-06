package com.poc.monitoring.query

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class QueryServerApplication

fun main(args: Array<String>) {
	runApplication<QueryServerApplication>(*args)
}
