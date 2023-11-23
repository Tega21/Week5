// Brandon Ortega// CST 239// 11.26.2023// This is my own work

package app;

import java.util.Iterator;
import java.util.Stack;

/**
 * This class demonstrates basic operations with Java's Stack class.
 * LIFO (Last In First Out)
 */
public class PlayStack {

    /**
     * Method creates stacks, adds elements, checks stack properties,
     * and iterates over a stack using an iterator and popping elements.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {

        // Creating a Stack of Strings and adding elements
        Stack<String> stringStack = new Stack<String>();
        stringStack.push("Brandon Ortega");
        stringStack.push("Peter Parker");
        stringStack.push("Bruce Wayne");
        stringStack.push("Ash Ketchum");

        // Creating a Stack of Integers and adding elements
        Stack<Integer> intStack = new Stack<Integer>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);

        // Checking size and printing the second element of the integer stack
        System.out.println(intStack);
        System.out.printf("Integer Stack Tests: size is %d and second element is %d\n",
                intStack.size(), intStack.elementAt(1));

        // Iterating over and popping elements from the string stack
        Iterator<String> itr = stringStack.iterator();
        while (itr.hasNext()){
            System.out.println(stringStack.pop());
        }
    }
}
