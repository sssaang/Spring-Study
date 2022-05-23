package org.sssaang.simplemarket

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleMarketApplication

fun main(args: Array<String>) {
	runApplication<SimpleMarketApplication>(*args)
}
