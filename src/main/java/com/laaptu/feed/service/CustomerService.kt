package com.laaptu.feed.service

import com.laaptu.feed.model.Customer

interface CustomerService {
    fun getAllCustomers(): List<Customer>
}