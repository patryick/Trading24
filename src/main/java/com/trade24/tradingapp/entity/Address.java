package com.trade24.tradingapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "address")
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue
    private Long id;

    private String city;

    private String country;

    private String street;

    private Integer houseNumber;

    private Integer flatNumber;

    private String zipCode;

    @Override
    public String toString() {
        return "Address{" + "id=" + id + ", city='" + city + '\'' + ", country='" + country + '\'' + ", street='" + street + '\'' + ", houseNumber=" + houseNumber + ", flatNumber=" + flatNumber + ", zipCode='" + zipCode + '\'' + '}';
    }
}
