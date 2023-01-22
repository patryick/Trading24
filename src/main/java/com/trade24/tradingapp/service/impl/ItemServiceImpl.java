package com.trade24.tradingapp.service.impl;

import com.trade24.tradingapp.entity.Category;
import com.trade24.tradingapp.entity.Item;
import com.trade24.tradingapp.entity.User;
import com.trade24.tradingapp.repository.ItemRepository;
import com.trade24.tradingapp.service.CategoryService;
import com.trade24.tradingapp.service.ItemService;
import com.trade24.tradingapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;
    private final UserService userService;
    private final CategoryService categoryService;

    @Autowired
    public ItemServiceImpl(ItemRepository itemRepository, UserService userService, CategoryService categoryService) {
        this.itemRepository = itemRepository;
        this.userService = userService;
        this.categoryService = categoryService;
    }

    @Override
    public List<Item> getAllItems(Long id) {
        List list = new ArrayList<Item>();
        this.itemRepository.findAll().forEach(item -> {
            if (item.getOwner().getId() == id) {
                list.add(item);
            }
        });

        return list;
    }

    @Override
    public Item getItem(Long id) {
        return itemRepository.findById(id).orElse(null);
    }

    @Override
    public Item addItem(Item item) {
        if (item.getCategory() == null || item.getOwner() == null) {
            throw new IllegalArgumentException("Item must have category and ownerId");
        }

        User owner = userService.getUserById(item.getOwner().getId());
        if (owner == null) {
            throw new IllegalArgumentException("No such user" + owner);
        }
        
        item.setOwner(owner);
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
