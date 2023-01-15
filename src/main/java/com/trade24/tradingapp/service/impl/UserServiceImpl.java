package com.trade24.tradingapp.service.impl;

import com.trade24.tradingapp.entity.User;
import com.trade24.tradingapp.repository.UserRepository;
import com.trade24.tradingapp.service.AddressService;
import com.trade24.tradingapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final AddressService addressService;

    @Autowired
    public UserServiceImpl (UserRepository userRepository, AddressService addressService) {
        this.userRepository = userRepository;
        this.addressService = addressService;
    }

    @Override
    public User addUser(User user) {
        System.out.println(user.getAddress());
        if (addressService.getById(user.getAddress().getId()) == null) {
            System.out.println(this.addressService.addAddress(user.getAddress()));
        }
        return this.userRepository.save(user);
    }

    @Override
    public void updateUser(Long id, User user) {

    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public User getUserById(Long id) {
        return this.userRepository.findById(id).orElse(null);
    }
}
