package domain.customer

import domain.customer.model.Customer

interface CustomerRepository {
    fun getById(id: String): Customer?
    fun save(customer: Customer)
}