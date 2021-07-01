package com.hari.upadhyay.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.hari.upadhyay.entity.Transaction;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    // TODO Limit to recent transactions and implement separate endpoint to view old transactions
    List<Transaction> findBySourceAccountIdOrderByInitiationDate(long id);
}