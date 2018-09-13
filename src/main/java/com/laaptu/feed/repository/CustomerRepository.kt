package com.laaptu.feed.repository

import com.laaptu.feed.model.Customer

interface CustomerRepository{
    fun getAllCustomers():List<Customer>
}