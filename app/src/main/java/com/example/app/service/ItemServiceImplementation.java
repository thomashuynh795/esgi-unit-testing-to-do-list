package com.example.app.service;

import com.example.app.model.Item;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ItemServiceImplementation implements ItemServiceInterface {

    @Override
    public Item createItem(Item item) {
        return null;
    }

    @Override
    public Item getItem(UUID id) {
        return null;
    }

    @Override
    public Item getAllItem() {
        return null;
    }

}
