// Brandon Ortega// CST 239// 11.26.2023// This is my own work

package app;

/**
 * The Storage class provides a generic way to store and retrieve data.
 * It allows storing a single object of any type.
 *
 * @param <T> the type of the object that this storage will hold
 */
public class Storage<T> {
    private T s = null;

    /**
     * Constructs a new Storage object with the specified initial data.
     *
     * @param s the initial data to store in this Storage object
     */
    public Storage(T s){
        this.s = s;
    }

    /**
     * Retrieves the data stored in this Storage object.
     *
     * @return the data stored in this Storage object
     */
    public T getData(){
        return this.s;
    }

    /**
     * Main method demonstrates creating Storage instances for 
     * different data types and getting data from them.
     * 
     * @param args
     */
    public static void main(String[] args) {
        Storage<String> storage1 = new Storage<String>("Brandon Ortega");
        System.out.println("This is the data " + storage1.getData());
        Storage<Integer> storage2 = new Storage<Integer>(3);
        System.out.println("This is the data " + storage2.getData());
    }

}
