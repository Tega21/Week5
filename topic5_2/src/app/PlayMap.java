// Brandon Ortega// CST 239// 11.26.2023// This is my own work

package app;

import java.util.HashMap;
import java.util.Map;

/**
 * The PlayMap class demonstrates basic operations with Java Maps, particularly HashMap.
 * It includes examples of creating maps, adding entries, retrieving values, iterating over map entries,
 * and clearing or removing entries from the maps.
 */
public class PlayMap {

    /**
     * The main method contains examples of working with HashMaps of different types.
     * It demonstrates creating maps, adding key-value pairs, checking map properties,
     * iterating over a map, and clearing or removing entries.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {

        // Creating a HashMap with integer keys and values
        Map<Integer, Integer> integerMap = new HashMap<Integer, Integer>();
        integerMap.put(1, 1);
        integerMap.put(2, 2);

        // Creating a HashMap with integer keys and string values
        Map<Integer, String> stringMap = new HashMap<Integer, String>();
        stringMap.put(1, "One");
        stringMap.put(2, "Two");

        // Creating a HashMap with string keys and values
        Map<String, String> nameMap = new HashMap<String, String>();
        nameMap.put("FirstName", "Brandon");
        nameMap.put("Lastname", "Ortega");

        // Checking size and emptiness of the map, and printing its contents
        System.out.printf("Name map tests: size is %d and is empty %b\n", nameMap.size(), nameMap.isEmpty());
        for(Map.Entry<String, String> m : nameMap.entrySet()){
            System.out.printf("Key: %s Value: %s\n", m.getKey(), m.getValue());
        }

        // Clearing and removing elements from the maps
        integerMap.clear();
        stringMap.remove(1);
        stringMap.clear();
        nameMap.clear();
    }
}
