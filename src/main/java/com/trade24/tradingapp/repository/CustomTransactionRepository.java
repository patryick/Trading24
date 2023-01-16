package com.trade24.tradingapp.repository;

import com.trade24.tradingapp.entity.Transaction;

import java.util.List;

public interface CustomTransactionRepository {
    List<Transaction> findByUserId(Long userId);
}
