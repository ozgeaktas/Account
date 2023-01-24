package com.ozgeakdas.Account.dto

import java.math.BigDecimal
import java.time.LocalDateTime

data class AccountDto(
        val id:String?,
        val balance: BigDecimal? = BigDecimal.ZERO,
        val creationDate: LocalDateTime?,
        var customer: AccountCustomerDto?,
        var transactions: Set<TransactionDto>?
){

}
