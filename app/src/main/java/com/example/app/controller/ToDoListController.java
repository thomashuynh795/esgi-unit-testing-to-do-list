package com.example.app.controller;

import com.example.app.model.ToDoList;
import com.example.app.service.ToDoListServiceInterface;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todolist")
@AllArgsConstructor
public class ToDoListController {

    private final ToDoListServiceInterface toDoListService;


}
