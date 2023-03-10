package com.trade24.tradingapp.controller;

import com.trade24.tradingapp.entity.Address;
import com.trade24.tradingapp.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
@CrossOrigin(origins = "http://localhost:3333", maxAge = 3600)
public class AddressController {
    private AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    void updateAddress(Long id, Address address) {

    }
}
