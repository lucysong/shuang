package com.happyslowly.polymorphism;

public abstract class Cat {
  private PurringBehavior purringBehavior;
  private RunningBehavior runningBehavior;
  
  public PurringBehavior getPurringBehavior() {
    return purringBehavior;
  }

  public void setPurringBehavior(PurringBehavior purringBehavior) {
    this.purringBehavior = purringBehavior;
  }

  public RunningBehavior getRunningBehavior() {
    return runningBehavior;
  }

  public void setRunningBehavior(RunningBehavior runningBehavior) {
    this.runningBehavior = runningBehavior;
  }

  public void purr() {
    purringBehavior.purr();
  }
  
  public void run() {
    runningBehavior.run();
  }

  abstract public void display();
}
