// Brandon Ortega// CST 239// 11.26.2023// This is my own work

package app;

/**
 * This class provides a method to print elements of any array regardless of its type.
 * 
 */
public class MyArray {

    /**
     * Prints each element of the input array to the console.
     * This method is generic, meaning it can handle arrays of any object type.
     *
     * @param <E> the type of elements in the input array
     * @param inputArray the array whose elements are to be printed
     */
    public <E> void printArray(E[] inputArray){
        for(E element : inputArray){
            System.out.printf("%s ", element);
        }
    }

    /**
     * The main method creates arrays of different types 
     * (Integer, Double, and Character) and uses the printArray 
     * method to print each array's elements.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Creating arrays of different types
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        // Instance of MyArray to use its method
        MyArray ma = new MyArray();

        // Printing arrays
        System.out.println("intArray contains:");
        ma.printArray(intArray);
        System.out.println("\ndoubleArray contains:");
        ma.printArray(doubleArray);
        System.out.println("\ncharArray contains:");
        ma.printArray(charArray);
    }
}
