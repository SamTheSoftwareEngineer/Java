// Blueprint to create new item object
public class Item {
    // Private means they cannot be directly accessed from outside this class
    // To access them, you need getter methods
    private String name;
    private int quantity;

    // Parameterized constructor 
    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    
    // Getter methods 
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
    
}
