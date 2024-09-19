// Arrays are a special type of variable that represents multiple values that are all of the same data type
// - An array is a named collection of contigous storage locations 


// Can declare an array like so:
// int[] scores;
// Can determine the size of an array bu giving initial values or declaring it using the new keyword
// followed by the data type and size

// Example:
// int[] scores = new int[5];
// int[] scores = {100, 99, 98, 97, 96};


class PetsArray {
    public static void main(String[] args) {
      String[] pets = {"dog", "cat", "fish"};
      System.out.println(pets[0]);
      System.out.println(pets[2]);
    }
  }

  class ArrayAssign {
    public static void main(String[] args) {
      String[] petList = {"dog", "cat", "fish"};
      System.out.print("Original array: ");
      System.out.println(petList[0] + ", " + petList[1] + ", " + petList[2]);
      petList[1] = "hamster";
      System.out.print("Modified array: ");
      System.out.println(petList[0] + ", " + petList[1] + ", " + petList[2]);
    }
  }
