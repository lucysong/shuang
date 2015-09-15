Collections
===========

Hierarchy
---------
![hierarchy](collections.png)

Interface
---------
1. `Collection`
  * `add(E e)`
2. `Map`
  * `put(K k, V v)`
  * `get(K k)`
3. `List`
  * `get(int index)`
  * `remove(int index)`
4. `Set`

Concrete Class
--------------

Type | Backend
---- | -------
ArrayList | array
LinkedList | linked list
HashSet | hash table
TreeSet | red-black tree
LinkedHashSet | hash table + linked list
HashMap | hash table
TreeMap | red-black tree
LinkedHashMap | hash table + linked list

Interator
---------
1. `Iterator`
  * `next()`
  * `hashNext()`
2. `Iterable`
  * `iterator()`

Again, the Object
-----------------
1. `Object`
  * `equals(Object o)`
  * `hashCode()`
2. `Comparable`
  * `compareTo(T other)`
3. `Comparator`
  * `compare(T a, T b)`

Views
-----
1. `Arrays.asList`
2. `List.subList(int start, int end)`
3. Map views
  * `Map.keySet()`
  * `Map.valueSet()`
  * `Map.entrySet()`
3. Unmodifiable Views
  * `Collections.unmodifiableCollection`
  * `Collections.unmodifiableList`
  * `Collections.unmodifiableSet`
  * `Collections.unmodifiableSortedSet`
  * `Collections.unmodifiableMap`
  * `Collections.unmodifiableSortedMap`
  
Alogorithms
-----------
1. `Collections`
2. `Arrays`
