package com.example.vendingbackend.model

import jakarta.persistence.*
import java.time.LocalDate

@Entity
data class VendingMachine(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val location: String,
    @OneToMany(mappedBy = "vendingMachine")
    val transactions: List<Transaction>,
    @OneToMany(mappedBy = "vendingMachine")
    val inventories: List<Inventory>
)
