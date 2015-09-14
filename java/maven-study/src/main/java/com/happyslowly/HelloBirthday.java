package com.happyslowly;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class HelloBirthday {

  private static final DateTime NEXT_BIRTHDRAY = new DateTime(2016, 7, 23, 0, 0, 0);

  public static void main(String[] args) {
    System.out.println("Hello, Birthday! " + Days.daysBetween(new DateTime(), NEXT_BIRTHDRAY).getDays() + " days left");
  }
}
