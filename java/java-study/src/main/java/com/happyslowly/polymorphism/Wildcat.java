package com.happyslowly.polymorphism;

public class Wildcat extends Cat {

  public Wildcat() {
    setPurringBehavior(new Purring());
    setRunningBehavior(new RunningWithFourLegs());
  }
  
  @Override
  public void display() {
    System.out.println("I'm a wildcat");
  }

}
