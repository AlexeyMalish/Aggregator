package domain.order

import domain.order.model.Product
import domain.order.model.Order

interface OrderFactory {
    fun createOrder(products: List<Product>, address: String): Order
}