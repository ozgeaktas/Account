package com.ozgeakdas.Account.dto;

import com.ozgeakdas.Account.model.Transaction;
import org.springframework.stereotype.Component;

@Component
public class TransactionDtoConverter {
    public TransactionDto convert(Transaction from){
        return new TransactionDto(from.getId(),
                from.getTransactionType(),
                from.getAmount(),
                from.getTransactionDate());
    }
}
