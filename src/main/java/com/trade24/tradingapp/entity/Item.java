package com.trade24.tradingapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "items")
@Getter
@Setter
public class Item {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String description;

    private String imageUrl;

    private Long amount;

    private Long price;

    @ManyToOne(optional = false) //TODO true
    @JoinColumn(name = "category_id", nullable = false) //TODO nullable = false
    private Category category;

    private Date addedDate;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User owner;
}
