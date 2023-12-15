package com.example.app.service;

import java.util.UUID;

import com.example.app.model.ToDoList;

public interface ToDoListServiceInterface {

    ToDoList createToDoList(ToDoList toDoList);
    ToDoList getToDoListByUserId(UUID id);
    
}
