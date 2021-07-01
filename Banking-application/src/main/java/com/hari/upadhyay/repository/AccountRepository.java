package com.hari.upadhyay.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hari.upadhyay.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Optional<Account> findBySortCodeAndAccountNumber(String sortCode, String accountNumber);
}