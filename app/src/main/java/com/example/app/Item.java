package com.example.app;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.time.Period;

@AllArgsConstructor
@Getter
@Setter
@Builder

public class Item {
    private String name;
    private String content;
    final LocalDate addDate;

    public boolean contentIsValid(Item item){
        if(item.getContent().length()>1000){
            return false;
        }
        return true;
    }
    

    
}
