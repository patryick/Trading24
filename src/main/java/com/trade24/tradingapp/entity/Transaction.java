package com.trade24.tradingapp.entity;

import com.trade24.tradingapp.enums.TransactionStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "transactions")
@Getter
@Setter
public class Transaction {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne()
    @JoinColumn(name = "requester")
    private User requester;

    @ManyToOne(optional = false)
    @JoinColumn(name = "owner", nullable = false)
    private User owner;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Item> requesterItems;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Item> ownerItems;

    private TransactionStatus status;
}
