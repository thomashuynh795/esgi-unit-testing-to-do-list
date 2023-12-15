package com.example.app.repository;

import java.util.UUID;

import com.example.app.model.ToDoList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoListRepository extends JpaRepository<ToDoList, UUID> {
}
