package com.example.app.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.time.LocalDateTime;
import java.util.UUID;


@Table(name = "Item")
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
    private LocalDateTime createdAt;
    @JoinColumn(name = "toDoListId")
    private ToDoList toDoList;

    // public boolean contentIsValid() {
    // if (this.content.length() > 1000) {
    // return false;
    // }
    // return true;
    // }

}
