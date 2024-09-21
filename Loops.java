// There are two different types of iterations with loops in Java, indefinite and definite.
// Indefinite - loops that do not specify, in advance, how many times it is to be run. It repeats as long as a condition is met, typically a while loop.
// Definite - loops that specify, in advance, how many times it is to be run. It repeats a certain number of times, typically a for loop.

import java.util.Scanner;

class WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This loop will run as long as the input is > 0.");
        // Initialize loop varirable so that the loop with run (>0)
        int entry = 1;
        while (entry > 0) {
            System.out.println("Enter a number (0 or less to quit):");
            entry = input.nextInt();
        }
        System.out.println("=== End of Loop ===\n");
    }
}

class ForLoop {
    public static void main(String[] args) {
        System.out.println("This for loop will count to 5: ");
        /* The loop variable, count, starts with a value of 1. 
         * The loop keeps running as long as count <= 5
         * After each iteration - before returning to the top of the loop -
         * count is incremented by 1.
         */
        for (int count = 1; count <= 5; count++) {
            System.out.println(count);
        }
        System.out.println("The loop is done.");
    }
}

// Loops using While & Do...While
class WhileEven {
    public static void main(String[] args) {
        System.out.println("This program keeps prompting the user to enter numbers ");
        System.out.println("as long as the entries are even. When the user enters an ");
        System.out.println("odd number.\n");
        Scanner input = new Scanner(System.in);

        int number = 0;
        while(number % 2 == 0) {
            System.out.print("Enter a whole number: ");
            number = input.nextInt();
        }
        System.out.println("The loop is done.");
    }
}
 
class AppendWhile {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String textToAdd = "";
    String text = "";
    
    // Can't use == to check for equality of Strings. Need to use
    // the equals() or equalsIgnoreCase() to compare Strings.
    // Remember that ! means "not"
    while(!textToAdd.equalsIgnoreCase("quit")) {
      System.out.print("Enter a string, enter quit to exit the loop: ");
      textToAdd = input.nextLine();
      // Append input to text with space after it.
      text += textToAdd + " ";
    }
    System.out.println("\n" + text);
  }
}

class Break {
    public static void main(String[] args) {
        String textToAdd = "";
        String text = "";

        // Can't use == to check for equality of Strings. Need to use
        // the equals() or equalsIgnoreCase() to compare Strings.
        // Remember that ! means "not"
        // If the user enters a word longer than 4 letters, the loop ends.

        while(!textToAdd.equalsIgnoreCase("quit")) {
            System.out.println("Enter a string, enter quit or a word of more than 4");
            System.out.println("letters to exit the loop: ");
            textToAdd = input.nextLine();
            if (textToAdd.length()> 4) {
                break;
            }
            // Append input to text with space after it.
            text += textToAdd + " ";
        }
        System.out.println("\n" + text);
    }
}


class BreakContinue {
    public static void main(String[] args) {
        String textToAdd = "";
        String text = "";

        // Can't use == to check for equality of Strings. Need to use
        // the equals() or equalsIgnoreCase() to compare Strings.
        // Remember that ! means "not"
        // If the user enters a word longer than 4 letters, the loop ends.

        while(!textToAdd.equalsIgnoreCase("quit")) {
            System.out.println("Enter a string, enter quit or a word of more than 4");
            System.out.println("letters to exit the loop: ");
            textToAdd = input.nextLine();
            if (textToAdd.length() > 4) {
                continue;
            }
            if (textToAdd.equalsIgnoreCase("quit")) {
                break;
            }
            // Append input to text with space after it.
            text += textToAdd + " ";
        }
        System.out.println("\n" + text);
    }
}

class DoWhile {
    public static void main(String[] args) {
        System.out.println("This program keeps prompting the user to enter numbers ");
    System.out.println("as long as the entries are even. When the user enters an ");
    System.out.println("odd number.\n");
    Scanner input = new Scanner(System.in);
    // number not initialized since it will get a value in the body of the loop
    int number;
    do{
      System.out.print("Enter a whole number: ");
      number = input.nextInt();
    }
    while(number % 2 == 0);
    
    System.out.println("The loop is done.");
  }
}