package com.laaptu.feed.service

import com.laaptu.feed.model.Customer
import com.laaptu.feed.repository.CustomerRepoImpl
import com.laaptu.feed.repository.CustomerRepository

class CustomerServiceImpl : CustomerService {
    val customerRepository: CustomerRepository = CustomerRepoImpl()
    override fun getAllCustomers(): List<Customer> {
        return customerRepository.getAllCustomers()
    }

}