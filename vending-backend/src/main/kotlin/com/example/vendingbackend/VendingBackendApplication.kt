package com.example.vendingbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VendingBackendApplication

fun main(args: Array<String>) {
	runApplication<VendingBackendApplication>(*args)
}
