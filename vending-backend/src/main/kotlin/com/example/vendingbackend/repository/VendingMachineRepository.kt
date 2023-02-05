package com.example.vendingbackend.repository

import com.example.vendingbackend.model.VendingMachine
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface VendingMachineRepository : JpaRepository<VendingMachine, Int>