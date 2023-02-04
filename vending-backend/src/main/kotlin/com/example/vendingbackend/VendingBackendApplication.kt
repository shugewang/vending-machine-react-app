package com.example.vendingbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.*

@SpringBootApplication
class VendingBackendApplication


@RestController
class MessageController {
	@GetMapping("/")
	fun index(@RequestParam("name") name: String) = "Hello, $name!"
}

fun main(args: Array<String>) {
	runApplication<VendingBackendApplication>(*args)
}
