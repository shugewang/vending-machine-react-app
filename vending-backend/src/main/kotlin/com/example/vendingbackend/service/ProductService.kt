package com.example.vendingbackend.service

import com.example.vendingbackend.model.Product

interface ProduceService {
    fun getUserSelection(productId: Int): Product

}