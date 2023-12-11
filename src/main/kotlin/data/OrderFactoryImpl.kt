package data

import domain.order.OrderFactory
import domain.order.model.Product
import domain.order.model.Order
import domain.order.model.OrderStatus
import java.util.*

class OrderFactoryImpl : OrderFactory {
    override fun createOrder(products: List<Product>, address: String): Order {
        val id = UUID.randomUUID().toString()
        val status = OrderStatus.PENDING
        return Order(id, status, products, address)
    }
}