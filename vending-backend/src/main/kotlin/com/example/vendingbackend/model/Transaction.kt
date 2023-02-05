package com.example.vendingbackend.model

import jakarta.persistence.*
import java.time.LocalDate

@Entity
data class Transaction(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,

    @ManyToOne
    val product: Product,
    val total: Double,
    val purchaseDate: LocalDate,
    @ManyToOne
    val vendingMachine: VendingMachine
)
