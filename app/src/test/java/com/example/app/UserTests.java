package com.example.app;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTests {

  private User user;
  private ExternalApi externalApi;

  @BeforeEach
  public void setup() {
    this.externalApi = mock(ExternalApi.class);
    this.user = User.builder()
        .email("user@email.com")
        .firstname("firstname")
        .lastname("lastname")
        .birthdate(LocalDate.now().minusYears(18))
        .externalApi(externalApi)
        .build();
  }

  @Test
  public void userNominalTest() {
    assertTrue(user.isValid());
  }

  @Test
  public void badEmailTest() {
    user.setEmail("test");
    assertFalse(user.isValid());
  }

  @Test
  public void badFirstnameTest() {
    user.setFirstname("");
    assertFalse(user.isValid());
  }

  @Test
  public void badBirthdateTest() {
    this.user.setBirthdate(LocalDate.now().plusYears(1));
    assertFalse(user.isValid());
  }

  @Test
  public void mockTest() {
    when(this.externalApi.isEmailValid()).thenReturn(true);
    assertTrue(this.user.isValidWithExternalApi());
  }

}
