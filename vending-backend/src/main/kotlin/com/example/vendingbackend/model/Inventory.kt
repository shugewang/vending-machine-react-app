package com.example.vendingbackend.model

import jakarta.persistence.*
import java.time.LocalDate

@Entity
data class Inventory(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,

    @ManyToOne
    val product: Product,
    val quantity: Int,
    @ManyToOne
    val vendingMachine: VendingMachine
)
