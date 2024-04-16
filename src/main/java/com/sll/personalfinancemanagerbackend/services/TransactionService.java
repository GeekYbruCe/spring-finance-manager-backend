package com.sll.personalfinancemanagerbackend.services;

import com.sll.personalfinancemanagerbackend.entities.Transaction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TransactionService {
    List<Transaction> getTransactions();
    Transaction getTransaction(Long id);
    Transaction createTransaction(Transaction transaction);
    Transaction updateTransaction(Transaction transaction);
    void deleteTransaction(Long id);
}
