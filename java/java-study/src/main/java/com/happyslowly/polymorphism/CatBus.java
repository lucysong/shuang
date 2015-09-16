package com.happyslowly.polymorphism;

public class CatBus extends Cat {

  public CatBus() {
    setPurringBehavior(new PurringNoWay());
    setRunningBehavior(new RunningWithSixLegs());
  }
  
  @Override
  public void display() {
    System.out.println("I'm the kittenbus!");
  }
}
