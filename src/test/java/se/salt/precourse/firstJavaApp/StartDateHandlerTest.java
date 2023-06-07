package se.salt.precourse.firstJavaApp;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class StartDateHandlerTest {

  @Test
  void returns2ForDateDwoDaysInTheFuture() {
    LocalDate twoDaysInTheFuture = LocalDate.now().plusDays(2);
    long two = new StartDateHandler().daysToCourseStart(twoDaysInTheFuture.toString());

    assertEquals(2, two);
  }
}