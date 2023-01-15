package com.trade24.tradingapp.service.impl;

import com.trade24.tradingapp.entity.Item;
import com.trade24.tradingapp.repository.ItemRepository;
import com.trade24.tradingapp.service.ItemService;
import com.trade24.tradingapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;
    private final UserService userService;

    @Autowired
    public ItemServiceImpl(ItemRepository itemRepository, UserService userService) {
        this.itemRepository = itemRepository;
        this.userService = userService;
    }

    @Override
    public List<Item> getAllItems() {
        return null;
    }

    @Override
    public Item getItem(Long id) {
        return itemRepository.findById(id).orElse(null);
    }

    @Override
    public Item addItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public void updateItem(Long id, Item item) {

    }

    @Override
    public void deleteItem(Long id) {

    }

    @Override
    public List<Item> getUserItems(Long userId) {
        return null;
    }
}
