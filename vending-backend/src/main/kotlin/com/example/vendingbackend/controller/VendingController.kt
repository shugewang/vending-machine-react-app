//package com.example.vendingbackend.controller
//
//import com.example.vendingbackend.model.Product
//import com.example.vendingbackend.service.ProductServiceImp
//import org.springframework.web.bind.annotation.GetMapping
//import org.springframework.web.bind.annotation.PathVariable
//import org.springframework.web.bind.annotation.RequestMapping
//import org.springframework.web.bind.annotation.RestController
//import java.util.*
//
//@RestController
//@RequestMapping("/")
//class VendingController (private val productService: ProductServiceImp){
////    @GetMapping
////    fun getProductInfo(@PathVariable productId: Int): Optional<Product> = productService.getProductInfo(productId)
//
//    @GetMapping("/api/products/{id}")
//    fun getProductInfo(@PathVariable productId: Int): Optional<Product> {
//        return productService.getProductInfo(productId)
//    }
//}