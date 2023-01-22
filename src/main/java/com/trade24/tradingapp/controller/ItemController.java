package com.trade24.tradingapp.controller;

import com.trade24.tradingapp.entity.Item;
import com.trade24.tradingapp.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
@CrossOrigin(origins = "http://localhost:3333", maxAge = 3600)
public class ItemController {
    private ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }


    @GetMapping("/getAll/{id}")
    public List<Item> getAllItems(@PathVariable Long id) {
        System.out.println(id);
        return this.itemService.getAllItems(id);
    }

    @GetMapping("/get/{id}")
    public Item getItem(@PathVariable Long id) {
        return itemService.getItem(id);
    }

    @PostMapping("/add")
    public Item addItem(@RequestBody Item item) {
        System.out.println(item);
        return itemService.addItem(item);
    }

    public void updateItem(Long id, Item item) {

    }

    public void deleteItem(Long id) {

    }

    public List<Item> getUserItems(Long userId) {
        return null;
    }
}
