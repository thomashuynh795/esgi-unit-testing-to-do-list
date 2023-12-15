package com.example.app.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoListRepository extends JpaRepository<ToDoListRepository, UUID> {
    
}
