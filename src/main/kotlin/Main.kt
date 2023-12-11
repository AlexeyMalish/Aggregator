import data.CustomerFactoryImpl
import data.CustomerRepositoryImpl
import data.OrderFactoryImpl
import data.OrderRepositoryImpl
import domain.customer.CustomerFactory
import domain.customer.CustomerRepository
import domain.customer.model.CardType
import domain.customer.model.PaymentMethod
import domain.order.OrderFactory
import domain.order.OrderRepository
import domain.order.model.Product

fun main() {
    val customerRepository: CustomerRepository = CustomerRepositoryImpl()
    val customerFactory: CustomerFactory = CustomerFactoryImpl()
    val orderRepository: OrderRepository = OrderRepositoryImpl()
    val orderFactory: OrderFactory = OrderFactoryImpl()

    // Создание покупателя
    val customer = customerFactory.createCustomer("Vasya Pupkin", CardType.VISA, PaymentMethod.CARD)
    customerRepository.save(customer)

    // Получение покупателя по идентификатору
    val fetchedCustomer = customerRepository.getById(customer.id)
    if (fetchedCustomer != null) {
        println("Fetched customer: $fetchedCustomer")
    } else {
        println("Customer not found")
    }

    // Создание заказа
    val items = listOf(Product("1", "Product 1", 100.0), Product("2", "Product 2", 200.0))
    val order = orderFactory.createOrder(items, "Gio Pika Street")
    orderRepository.save(order)

    // Получение заказа по идентификатору
    val fetchedOrder = orderRepository.getById(order.id)
    if (fetchedOrder != null) {
        println("Fetched order: $fetchedOrder")
    } else {
        println("Order not found")
    }
}
