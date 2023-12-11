package data

import domain.order.OrderRepository
import domain.order.model.Order

class OrderRepositoryImpl : OrderRepository {
    private val orders = mutableMapOf<String, Order>()

    override fun getById(id: String): Order? {
        return orders[id]
    }

    override fun save(order: Order) {
        orders[order.id] = order
    }
}