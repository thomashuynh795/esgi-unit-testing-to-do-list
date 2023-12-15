package com.example.app.controller;

import com.example.app.model.ToDoList;
import com.example.app.model.User;
import com.example.app.service.ToDoListServiceInterface;
import com.example.app.service.UserServiceInterface;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final UserServiceInterface userService;
    private final ToDoListServiceInterface todolistService;

    @PostMapping("")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PostMapping("/{userId}/todolist")
    public ToDoList createTodolist(@PathVariable UUID userId, @RequestBody ToDoList todolist) {
        try {
            return todolistService.createToDoList(userId, todolist);
        } catch (Exception e) {
            return null;
        }
    }


}
