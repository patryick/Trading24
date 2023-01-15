package com.trade24.tradingapp.service;

import com.trade24.tradingapp.entity.User;

public interface UserService {
    User addUser(User user);
    void updateUser(Long id, User user);
    void deleteUser(Long id);
    User getUserById(Long id);
}
