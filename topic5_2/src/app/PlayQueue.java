// Brandon Ortega// CST 239// 11.26.2023// This is my own work

package app;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Class includes examples of creating queues, adding elements, iterating over the queue,
 * 
 */
public class PlayQueue {

    /**
     * Queue is FIFO (First In First Out)
     * @param args
     */
    public static void main(String[] args) {

        Queue<String> stringQueue = new LinkedList<String>();
        stringQueue.offer("Brandon Ortega");
        stringQueue.add("Luke Skywalker");
        stringQueue.offer("Peter Parker");
        stringQueue.add("Bruce Wayne");

        // Setup a queue of Integers
        Queue<Integer> integerQueue = new LinkedList<Integer>();
        integerQueue.add(1);
        integerQueue.offer(-1);
        integerQueue.add(5);
        integerQueue.offer(10);

        // Print out size and head of element of queue
        System.out.println(integerQueue);
        System.out.printf("Integer Queue Tests: size is %d and head element is %d\n",
                integerQueue.size(), integerQueue.peek());

        // Use Iterator to get elements from Queue
        Iterator<String> itr = stringQueue.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
