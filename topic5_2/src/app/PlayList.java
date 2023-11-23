// Brandon Ortega// CST 239// 11.26.2023// This is my own work

package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * This class demonstrates basic operations with Java Collections,
 * specifically ArrayLists. I am adding elements to a list,
 * retrieving elements, and iterating over the lists using different methods.
 */
public class PlayList {

    /**
     * Using ArrayLists of different types. Adding elements, retrieving 
     * the first element, and iterating over the lists.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {

        // Creating a list of Integers and adding elements
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(Integer.valueOf(10));
        integerList.add(Integer.valueOf(11));

        // Creating a list of Strings and adding elements
        List<String> stringList = new ArrayList<String>();
        stringList.add("Hello World");
        stringList.add("Hi World");

        // Retrieving and printing the first element from each list
        System.out.printf("Integer value: %d\n", integerList.get(0));
        System.out.printf("String value: %s\n", stringList.get(0));

        // Iterating over the integer list using a for-each loop
        for(Integer data : integerList){
            System.out.printf("Integer value: %d\n", data);
        }

        // Iterating over the string list using an Iterator
        Iterator<String> stringIterator = stringList.iterator();
        while (stringIterator.hasNext()){
            System.out.printf("String value: %s\n", stringIterator.next());
        }
    }
}
