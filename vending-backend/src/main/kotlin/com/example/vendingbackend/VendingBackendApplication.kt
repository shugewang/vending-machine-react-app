package com.example.vendingbackend

import com.example.vendingbackend.model.Product
import com.example.vendingbackend.service.ProductServiceImp
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.*
import java.util.*

@SpringBootApplication
class VendingBackendApplication


@RestController
class MessageController (private val productService: ProductServiceImp) {
	@GetMapping("/")
	fun index(@RequestParam("name") name: String) = "Hello, $name!"

//	@RequestMapping("/{productId}")
//	fun index(@PathVariable productId: Int) = "Hello, $productId!"

	@GetMapping("/api/products/{productId}")
	fun getProductInfo(@PathVariable productId: Int): String {
//		return productService.getProductInfo(productId)
		return "Hello, $productId!"
	}
}

fun main(args: Array<String>) {
	runApplication<VendingBackendApplication>(*args)
}
