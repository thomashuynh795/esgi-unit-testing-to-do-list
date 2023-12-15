package com.example.app.controller;

import com.example.app.service.ItemServiceInterface;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
@AllArgsConstructor
public class ItemController {

    private final ItemServiceInterface itemService;

}
