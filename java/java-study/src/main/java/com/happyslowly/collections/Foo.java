package com.happyslowly.collections;

import java.util.HashSet;
import java.util.Set;

public class Foo {
  public static void main(String[] args) {
    Person p1 = new Person("Simon", "Xu");
    Person p2 = new Person("Simon", "Xu");
    
    Set<Person> theSet = new HashSet<Person>();
    theSet.add(p1);
    theSet.add(p2);
    
    System.out.println(theSet.contains(p1));
    System.out.println(theSet.contains(p2));
    System.out.println(theSet.size());
  }
}
