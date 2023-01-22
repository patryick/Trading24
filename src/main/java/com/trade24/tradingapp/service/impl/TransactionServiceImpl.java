package com.trade24.tradingapp.service.impl;

import com.trade24.tradingapp.entity.Transaction;
import com.trade24.tradingapp.entity.User;
import com.trade24.tradingapp.enums.TransactionStatus;
import com.trade24.tradingapp.repository.TransactionRepository;
import com.trade24.tradingapp.repository.UserRepository;
import com.trade24.tradingapp.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {
    private final TransactionRepository transactionRepository;
    private final UserRepository userRepository;

    @Autowired
    public TransactionServiceImpl(TransactionRepository transactionRepository, UserRepository userRepository) {
        this.transactionRepository = transactionRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<Transaction> getUserTransactions(Long userId) {
        return transactionRepository.findByUserId(userId);
    }

    @Override
    public Transaction addTransaction(Transaction transaction) {
//        if (transaction.getOwner() == null || transaction.getRequester() == null) {
//            throw new IllegalArgumentException("No owner or requester id");
//        }
//        User owner = this.userRepository.findById(transaction.getOwner().getId()).orElse(null);
//        User requester = this.userRepository.findById(transaction.getRequester().getId()).orElse(null);
//        if (owner == null) {
//            throw new IllegalArgumentException("no such user: " + owner);
//        }
//        // if (requester == null) {
        //     throw new IllegalArgumentException("no such user: " + requesterId);
        // }
//        transaction.setOwner(owner);
//        transaction.setRequester(requester);
        return this.transactionRepository.save(transaction);
    }

    @Override
    public void updateTransaction(Long id, Transaction transaction) {

    }

    @Override
    public void deleteTransaction(Long id) {
        this.transactionRepository.deleteById(id);
    }

    @Override
    public void changeTransactionStatus(Long id, TransactionStatus status) {

    }

    @Override
    public List getTransactions() {
        List list = new ArrayList<Transaction>();
        this.transactionRepository.findAll().forEach(transaction -> list.add(transaction));
        return list;
    }
}
