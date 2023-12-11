package domain.customer.model

data class Customer(
    val id: String,
    val name: String,
    val cardType: CardType,
    val paymentMethod: PaymentMethod
){
    init {
        require(id.isNotEmpty()) { "Id customer: $name is empty!" }
    }
}




