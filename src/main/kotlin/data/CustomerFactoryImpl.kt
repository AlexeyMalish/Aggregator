package data

import domain.customer.CustomerFactory
import domain.customer.model.CardType
import domain.customer.model.Customer
import domain.customer.model.PaymentMethod
import java.util.*

class CustomerFactoryImpl : CustomerFactory {
    override fun createCustomer(name: String, cardType: CardType, paymentMethod: PaymentMethod): Customer {
        val id = UUID.randomUUID().toString()
        return Customer(id, name, cardType, paymentMethod)
    }
}