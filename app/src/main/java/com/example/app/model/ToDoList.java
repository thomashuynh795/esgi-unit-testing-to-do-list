package com.example.app.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder.Default;

import java.time.LocalDateTime;
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
    private UUID userId;
    @OneToMany(mappedBy = "ToDoList")
    private List<Item> items;
    @Column()
    private LocalDateTime creationDate;

    // public ToDoList(User user) {
    // setCreator(user);
    // this.listItem = new Item[nbItem];
    // }

    // public void add(Item item) throws ArithmeticException {

    // if (indexItem < nbItem) {
    // if (isNameValid(item)) {
    // if (indexItem > 0) {
    // if (30 < ChronoUnit.MINUTES.between(listItem[indexItem - 1].getAddDate(),
    // LocalDate.now())) {
    // throw new ArithmeticException("You added something less than 30 minute ago");
    // }
    // }
    // if (indexItem == 7) {
    // EmailSenderService.sendEmail(getCreator());
    // }
    // item.setAddDate(LocalDateTime.now());
    // listItem[indexItem] = item;
    // indexItem++;
    // save();
    // } else
    // throw new ArithmeticException("Incorrect item name");
    // } else
    // throw new ArithmeticException("You have reached the items limit number");

    // }

    // public boolean isNameValid(Item item) {

    // for (int i = 0; i < indexItem; i++) {
    // if (item.getName() == listItem[i].getName()) {
    // return false;
    // }
    // }
    // return true;
    // }

    // public void save() {
    // throw new ArithmeticException("There is a problem with the database");
    // }

}
