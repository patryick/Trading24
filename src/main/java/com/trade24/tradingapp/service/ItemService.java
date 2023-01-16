package com.trade24.tradingapp.service;

import com.trade24.tradingapp.entity.Item;

import java.util.List;

public interface ItemService {
    List<Item> getAllItems(Long id);
    Item getItem(Long id);
    Item addItem(Item item, Long categoryId, Long ownerId);
    void updateItem(Long id, Item item);
    void deleteItem(Long id);
    List<Item> getUserItems(Long userId);
}
