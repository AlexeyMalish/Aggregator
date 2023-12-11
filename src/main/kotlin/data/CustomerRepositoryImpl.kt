package data

import domain.customer.CustomerRepository
import domain.customer.model.Customer

class CustomerRepositoryImpl : CustomerRepository {
    private val customers = mutableMapOf<String, Customer>()

    override fun getById(id: String): Customer? {
        return customers[id]
    }

    override fun save(customer: Customer) {
        customers[customer.id] = customer
    }
}
