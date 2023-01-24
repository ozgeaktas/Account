package com.ozgeakdas.Account.repository;

import com.ozgeakdas.Account.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,String> {
}
