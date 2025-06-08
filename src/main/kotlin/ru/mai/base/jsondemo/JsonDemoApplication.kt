package ru.mai.base.jsondemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JsonDemoApplication

fun main(args: Array<String>) {
	runApplication<JsonDemoApplication>(*args)
}
