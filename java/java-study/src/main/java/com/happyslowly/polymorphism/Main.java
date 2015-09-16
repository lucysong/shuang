package com.happyslowly.polymorphism;

public class Main {
  public static void main(String[] args) {
    Shape[] shapes = new Shape[]{new Circle(), new Triangle(), new Circle()};
    for (Shape shape : shapes) {
      shape.draw();
      shape.erase();
    }
  }
}
