package com.trade24.tradingapp.controller;

import com.trade24.tradingapp.entity.Item;
import com.trade24.tradingapp.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {
    private ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    public List<Item> getAllItems() {
        return null;
    }

    @GetMapping("/get/{id}")
    public Item getItem(@PathVariable Long id) {
        return itemService.getItem(id);
    }

    @PostMapping("/add")
    public Item addItem(@RequestBody Item item, @RequestParam Long categoryId, @RequestParam Long ownerId) {
        return itemService.addItem(item, categoryId, ownerId);
    }

    public void updateItem(Long id, Item item) {

    }

    public void deleteItem(Long id) {

    }

    public List<Item> getUserItems(Long userId) {
        return null;
    }
}
