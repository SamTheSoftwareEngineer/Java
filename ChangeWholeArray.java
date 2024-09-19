import java.util.Arrays;

// Once an array has been decalred, individual elements in the array can have thier values
// changed using the single equal sign, but not the whole array
class ChangeWholeArray {
    public static void main(String[] args) {
        // Original array content 
        int[] numbers = {1, 2, 3};
        System.out.println("Array contents: " + Arrays.toString(numbers));
        // Attempt to change entire array will give an error
        // numbers = {4, 5, 6};
        System.out.println("New array contents: " + Arrays.toString(numbers));
    }
}

// To change the contents of the array completely, use the new keyword to construct a whole new array object. Then, assign it using the single equal sign:
class ChangeWholeArrayUsingNew {
    public static void main(String[] args) {
        // Original array
        int[] numbers = {1, 2, 3};
        System.out.println("Array contents: " + Arrays.toString(numbers));
        // Assign whole new array using new and =
        numbers = new int[]{4, 5, 6};
        System.out.println("New array contents: " + Arrays.toString(numbers));
    }
}