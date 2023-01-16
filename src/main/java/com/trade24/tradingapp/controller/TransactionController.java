package com.trade24.tradingapp.controller;

import com.trade24.tradingapp.entity.Transaction;
import com.trade24.tradingapp.enums.TransactionStatus;
import com.trade24.tradingapp.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transaction")
@CrossOrigin(origins = "http://localhost:3333", maxAge = 3600)
public class TransactionController {

    private final TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/getByUser/{userId}")
    public List<Transaction> getUserTransactions(@PathVariable Long userId) {
        return this.transactionService.getUserTransactions(userId);
    }

    @PostMapping("/add")
    public Transaction addTransaction(@RequestBody Transaction transaction, @RequestParam Long ownerId, @RequestParam Long requesterId) {
        return this.transactionService.addTransaction(transaction, ownerId, requesterId);
    }

    public void updateTransaction(Long id, Transaction transaction) {

    }

    public void deleteTransaction(Long id) {
        this.transactionService.deleteTransaction(id);
    }
    public void changeTransactionStatus(Long id, TransactionStatus status) {

    }
}
