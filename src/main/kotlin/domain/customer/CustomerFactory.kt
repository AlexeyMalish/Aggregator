package domain.customer

import domain.customer.model.CardType
import domain.customer.model.Customer
import domain.customer.model.PaymentMethod

interface CustomerFactory {
    fun createCustomer(name: String, cardType: CardType, paymentMethod: PaymentMethod): Customer
}