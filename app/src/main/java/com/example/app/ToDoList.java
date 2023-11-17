package com.example.app;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class ToDoList {
  Item listItem[];
  int indexItem = 0;
  final int nbItem = 10;

  public void add(Item item) {
    
    if (indexItem < nbItem) {
      if (indexItem == 7) {
        
      }
      
      listItem[indexItem] = item;
      indexItem++;
    } else {
      throw new ArithmeticException("You have reached the items limit number");
    }

  }
  public boolean itemNameIsValid(Item item){
    
    for(int i = 0 ; i<indexItem ; i++){
        if(item.getName() == listItem[i].getName()){
            return false;
        }
    }
    return true;
  }
}
