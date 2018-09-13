package com.laaptu.feed

import com.laaptu.feed.model.Customer
import com.laaptu.feed.service.CustomerService
import com.laaptu.feed.service.CustomerServiceImpl

fun main(args: Array<String>) {
    val customerService: CustomerService = CustomerServiceImpl()
    val customers: List<Customer> = customerService.getAllCustomers()
    println(customers[0].firstName)
}