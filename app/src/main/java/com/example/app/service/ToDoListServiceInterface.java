package com.example.app.service;

import java.util.UUID;

import com.example.app.model.ToDoList;

public interface ToDoListServiceInterface {

    ToDoList createToDoList(UUID id, ToDoList toDoList) throws Exception;
    ToDoList getToDoListByUserId(UUID id);
    
}
