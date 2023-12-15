package com.example.app;

import com.example.app.model.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class EmailSenderService {

  static public void sendEmail(User user) {
    System.out.println("sendEmail method called");
  }

}
