package com.ozgeakdas.Account.repository;

import com.ozgeakdas.Account.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String > {
}
