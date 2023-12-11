package domain.order.model

data class Product(
    val id: String,
    val name: String,
    val price: Double
){
    init {
        require(id.isNotEmpty()) { "Id product: $name is empty!" }
    }
}
