package com.example.app.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Table(name = "Item")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    private String content;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "toDoListId", nullable = false)
    private ToDoList toDoList;

    @Column(nullable = false)
    private LocalDateTime creationDate = LocalDateTime.now();

}
