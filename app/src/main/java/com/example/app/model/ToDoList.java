package com.example.app.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
import java.util.UUID;

@Table(name = "ToDoList")
@AllArgsConstructor
@Getter
@Setter
public class ToDoList {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @OneToMany(mappedBy = "toDoList")
    private List<Item> items;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

}
