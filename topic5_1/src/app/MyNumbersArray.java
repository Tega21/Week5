// Brandon Ortega// CST 239// 11.26.2023// This is my own work

package app;

/**
 * This class provides a method to print elements of any numeric array
 * using generic methods with a bounded type parameter in Java.
 */
public class MyNumbersArray {
    
    /**
     * Prints each element of the input array to the console.
     * This method is generic, but it is bounded to only accept arrays of types that extend the Number class.
     *
     * @param <E> the type of elements in the input array, bounded to Number class
     * @param inputArray the array whose elements are to be printed, must be of a type that extends Number
     */
    public <E extends Number> void printArray(E[] inputArray){
        for(E element : inputArray){
            System.out.printf("%s ", element);
        }
    }

    /**
     * Method creates arrays of different numeric types 
     * (Integer, Double, and Float) and uses the printArray method 
     * to print each array's elements.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Creating arrays of numeric types
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Float[] floatArray = {0.0f, 1.0f, 2.5f, 3.5f};

        // Instance of MyNumbersArray to use its method
        MyNumbersArray ma = new MyNumbersArray();

        // Printing arrays
        System.out.println("intArray contains:");
        ma.printArray(intArray);
        System.out.println("\ndoubleArray contains:");
        ma.printArray(doubleArray);
        System.out.println("\nfloatArray contains:");
        ma.printArray(floatArray);
    }
}
