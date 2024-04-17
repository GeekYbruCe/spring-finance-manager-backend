package com.sll.personalfinancemanagerbackend.services;

import com.sll.personalfinancemanagerbackend.entities.Transaction;
import com.sll.personalfinancemanagerbackend.repositories.TransactionRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService{

    private final TransactionRepository transactionRepository;

    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }


    @Override
    public List<Transaction> getTransactions() {
        return transactionRepository.findAll();
    }

    @Override
    public Transaction getTransaction(Long id) {
        return transactionRepository.findById(id).orElse(null);
    }

    @Override
    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    @Override
    public Transaction updateTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    @Override
    public void deleteTransaction(Long id) {
        transactionRepository.deleteById(id);

    }
}
