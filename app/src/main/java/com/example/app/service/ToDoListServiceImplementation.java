package com.example.app.service;

import com.example.app.model.ToDoList;
import com.example.app.repository.ToDoListRepository;

public class ToDoListServiceImplementation implements ToDoListServiceInterface {

    private final ToDoListRepository toDoListRepository;

    @Override
    public ToDoList createToDolist(ToDoList toDoList) {
        return toDoListRepository.save(toDoList);
    }

}
