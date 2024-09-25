// A class that is defined as public can be used by other code 
public class PeopleCounter {
    // Attributes and methods go in between these curly braces 
    // Attributes should usually be private --> this ensures correct data encapsulation
    private long count = 0;

    public void anotherOne() {
        count++;
        System.out.println("So far " + count);
    }
}

