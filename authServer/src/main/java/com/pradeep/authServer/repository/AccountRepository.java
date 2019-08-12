package com.pradeep.authServer.repository;

import java.util.Optional;

import org.springframework.data.repository.Repository;

import com.pradeep.authServer.entity.Account;

public interface AccountRepository extends Repository<Account, Long> {
    Optional<Account> findByUsername(String username);

    Account save(Account account);

}
