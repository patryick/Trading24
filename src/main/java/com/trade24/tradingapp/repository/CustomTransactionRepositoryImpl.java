package com.trade24.tradingapp.repository;

import com.trade24.tradingapp.entity.Transaction;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class CustomTransactionRepositoryImpl implements CustomTransactionRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Transaction> findByUserId(Long userId) {
        TypedQuery<Transaction> typedQuery = entityManager.createQuery("SELECT t FROM Transaction t WHERE t.owner.id = :userId OR t.requester.id = :userId", Transaction.class);
        typedQuery.setParameter("userId", userId);
        return typedQuery.getResultList();
    }
}
