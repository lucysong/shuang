package com.happyslowly.polymorphism;

public class Triangle extends Shape {
  @Override
  public void draw() { 
    System.out.println("Draw a Triangle");
  }
  
  @Override
  public void erase() { 
    System.out.println("Erase a Triangle");
  }
  
}
