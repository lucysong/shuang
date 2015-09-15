package com.happyslowly.collections;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
  private Map<Person, Map<PhoneType, Integer>> book = new HashMap<Person, Map<PhoneType, Integer>>();

  public PhoneBook() {}
 
  public void add(Person person, PhoneType type, int number) {
    if (book.containsKey(person)) {
      book.get(person).put(type, number);
    } else {
      Map<PhoneType, Integer> entry = new HashMap<PhoneType, Integer>();
      entry.put(type,  number);
      book.put(person, entry);
    }
  }
  
  public Integer getNumber(Person person, PhoneType type) {
    return book.get(person) == null ? null : book.get(person).get(type);
  }
  
  public static void main(String[] args) {
    PhoneBook phoneBook = new PhoneBook();
    Person p = new Person("Simon", "Xu");
    
    phoneBook.add(p, PhoneType.MOBILE, 1234567890);
    
    System.out.println(phoneBook.getNumber(p, PhoneType.MOBILE));
    System.out.println(phoneBook.getNumber(p, PhoneType.HOME));
  }
}