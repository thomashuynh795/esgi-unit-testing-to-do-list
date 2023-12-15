package com.example.app.service;

import com.example.app.model.ToDoList;
import com.example.app.model.User;
import com.example.app.repository.ToDoListRepository;
import com.example.app.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ToDoListServiceImplementation implements ToDoListServiceInterface {

    private ToDoListRepository toDoListRepository;
    private UserRepository userRepository;

    @Override
    public ToDoList createToDoList(UUID userId, ToDoList toDoList) throws Exception {
        User user = userRepository.findById(userId).orElseThrow(() -> new Exception("No user found"));
        toDoList.setUser(user);
        return toDoListRepository.save(toDoList);
    }

    @Override
    public ToDoList getToDoListByUserId(UUID id) {
        return null;
    }

}
