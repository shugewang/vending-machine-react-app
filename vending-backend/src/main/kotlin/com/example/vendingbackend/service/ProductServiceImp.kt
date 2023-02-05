package com.example.vendingbackend.service

import com.example.vendingbackend.model.Product
import com.example.vendingbackend.repository.ProductRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductServiceImp (private val productRepository: ProductRepository) : ProduceService {
    override fun getProductInfo(productId: Int) : Optional<Product> {
        return productRepository.findById(productId)
    }
}