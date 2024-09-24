// Methods in Java include a special kind of variable called parameters.
// Parameters are used to pass data when calling a method.
// It is possible to have methods that do not take any parameters because they don't need any data from outside of the method to do their work.

import java.util.ArrayList;

// Example
static String sayHelloMethod(String name, int count) {
    // Local scope variable - parameteres that then serve as variables in the
    // body of the method.
    String greeting = "";
    for (int i = 0; i < count; i++) {
        greeting += "Hello, " + name + "\n";
    }
    return greeting;
}

// The method can be called from the main() method. A complete sample program looks like this:

public static void main(String[] args) {
    String userName = "Sophia";
    // Pass the userName variable as a parameter to sayHello()
    String greeting = sayHelloMethod(userName, 3);
    // Pass variable greeting as a parameter to println()
    System.out.println(greeting);
}

// Java methods can also take collections as parameters. Remember that collections can be generic:
public class SayHelloCollection {
  // Pass ArrayList of names to method
  // Remember that collections are generic. T is placeholder 
  // for the data type
  static <T> String sayHello(ArrayList<T> names) {
    // Local variable to assemble greeting
    String greeting = ""; 
    // T is the data type 
    for(T name : names) {
      greeting += "Hello, " + name + "\n";
    }
    return greeting;
  }

  public static void main(String[] args) {
    ArrayList<String> userNames = new ArrayList<>();
    userNames.add("Sophia");
    userNames.add("Sophie"); 
    userNames.add("Sophie");
    // Pass variable userNames as parameter to sayHello()
    String greetingOutput = sayHello(userNames);
    // Pass variable greetingOutput to as parameter println()
    System.out.println(greetingOutput);
  }
}

// Rather than printing the same name multiple times, you can use an array as a parameter to pass multiple names:

public class SayHelloArray {
  // Pass array of names to method
  static String sayHello(String[] names) {
    // Local variable to assemble greeting
    String greeting = "";   
    for(String name : names) {
      greeting += "Hello, " + name + "\n";
    }
    return greeting;
  }

  public static void main(String[] args) {
    String[] userNames = {"Sophia", "Sofia", "Sophie"};
    // Pass variable userNames as parameter to sayHello()
    String greetingOutput = sayHello(userNames);
    // Pass variable greetingOutput to as parameter println()
    System.out.println(greetingOutput);
  }
}