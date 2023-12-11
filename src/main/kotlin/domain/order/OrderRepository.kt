package domain.order

import domain.order.model.Order

interface OrderRepository {
    fun getById(id: String): Order?
    fun save(order: Order)
}