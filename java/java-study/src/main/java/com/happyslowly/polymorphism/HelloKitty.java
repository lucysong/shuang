package com.happyslowly.polymorphism;

public class HelloKitty extends Cat {

  public HelloKitty() {
    setPurringBehavior(new PurringNoWay());
    setRunningBehavior(new RunningNoWay());
  }
  
  @Override
  public void display() {
    System.out.println("I'm a hellokitty");
  }

}
