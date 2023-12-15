package com.example.app.service;

import java.util.UUID;

import com.example.app.model.Item;

public interface ItemServiceInterface {

    Item createItem(Item item);
    Item getItem(UUID id);
    Item getAllItem();
    
}
