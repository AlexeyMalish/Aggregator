package domain.order.model

data class Order(
    val id: String,
    val status: OrderStatus,
    val products: List<Product>,
    val address: String
) {
    init {
        require(address.isNotBlank()) { "Address is null!" }
        require(products.isNotEmpty()) { "Products is empty!" }
        require(id.isNotEmpty()) { "Id order is empty!" }
    }
}