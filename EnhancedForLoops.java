import java.util.Arrays;

// An enhanced for loop, also known as a for-each loop or range-based for loop, is a special
// version of the for loop that is designed to work with Java arrays and collections.

// The basic syntax for an enhanced for loop is:
// ``` for(<variable>: <array/collection) {
//          <statements>
//      }

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

class EnhancedForLoops {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Values in array: " + Arrays.toString(numbers));

        for (int number : numbers) {
            /* value can be used in statements in loop body */
            System.out.println(number + " * 2 = " + number * 2);
        }
    }
}

// Using an ArrayList
class EnhancedForCollectionArrayList {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("Annette");
    names.add("John");
    names.add("Lee");
    System.out.println("ArrayList: " + names.toString());
    for(String name : names) {
      System.out.println(name + " has " + name.length() + " letters.");
    }
  }
}

// Using a HashSet
class EnhancedForCollectionHashSet {
  public static void main(String[] args) {
    HashSet<String> names = new HashSet<>();
    names.add("Annette");
    names.add("John");
    names.add("Lee");
    System.out.println("HashSet: " + names.toString());
    for(String name : names) {
      System.out.println(name + " has " + name.length() + " letters.");
    }
  }
}

// IMPORTANT: The HashMap collection type is not iterable. 
// It cannot be directly looped over using an enhanced for loop. 
// However, there is a workaround. 
//The HashMap class has a .keySet() method that retrieves the Set of keys from the HashMap.
// This Set of keys is iterable, so it can be used with an enhanced for loop.
// With a key value, the HashMap's get() method can be used to get the value corresponding to the key:
class EnhancedForCollectionHashMap {

    public static void main(String[] args) {
      // HashMap holds key-value pairs. 
      // The key (user ID) is a String (case sensitive).
      // The value (score) is an Integer (int)
      HashMap<String, Integer> scores = new HashMap<>();
      scores.put("ssmith04", 88);
      scores.put("tlang01", 100);
      scores.put("glewis03", 99);
      System.out.println("HashMap: " + scores.toString());
      /* A HashMap isn't iterable, but the keySet() method returns
         a Set with the keys in the HashMap, which can be interated 
         over. The value can be retrieved using the key value 
      */
      for(var key : scores.keySet()) {
        // For each key retrieve the value (score) & print 
        System.out.println(key + " has a score of " + scores.get(key) + ".");
      }
    }
  }