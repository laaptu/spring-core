package com.laaptu.feed.repository

import com.laaptu.feed.model.Customer

class CustomerRepoImpl : CustomerRepository {
    override fun getAllCustomers(): List<Customer> {
        return listOf(
                Customer("Tom", "Cruise"),
                Customer("Arnold", "Swazenegger")
        )
    }
}