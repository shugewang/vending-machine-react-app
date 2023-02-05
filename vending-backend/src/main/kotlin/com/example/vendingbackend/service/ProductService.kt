package com.example.vendingbackend.service

import com.example.vendingbackend.model.Product
import java.util.*

interface ProduceService {
    fun getProductInfo(productId: Int): Optional<Product>

}