package com.ozgeakdas.Account.dto

import java.math.BigDecimal
import java.time.LocalDateTime

data class CustomerAccountDto(//Customer bilgisi olmayan dto
      val id:String,
      var balance: BigDecimal?= BigDecimal.ZERO,
      var transactions: Set<TransactionDto>?,
      val creationDate: LocalDateTime

){

}
