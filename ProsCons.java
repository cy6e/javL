import java.util.LinkedList; 
  
public class Threadexample { 
    public static void main(String[] args) 
        throws InterruptedException 
    { 
        // Object of a class that has both produce() 
        // and consume() methods 
        final PC pc = new PC(); 
  
        // Create producer thread 
        Thread t1 = new Thread(new Runnable() { 
            @Override
            public void run() 
            { 
                try { 
                    pc.produce(); 
                } 
                catch (InterruptedException e) { 
                    e.printStackTrace(); 
                } 
            } 
        }); 
  
        // Create consumer thread 
        Thread t2 = new Thread(new Runnable() { 
            @Override
            public void run() 
            { 
                try { 
                    pc.consume(); 
                } 
                catch (InterruptedException e) { 
                    e.printStackTrace(); 
                } 
            } 
        }); 
  
        // Start both threads 
        t1.start(); 
        t2.start(); 
  
        // t1 finishes before t2 
        t1.join(); 
        t2.join(); 
    } 
  
    // This class has a list, producer (adds items to list 
    // and consumber (removes items). 
    public static class PC { 
  
        // Create a list shared by producer and consumer 
        // Size of list is 2. 
        LinkedList<Integer> list = new LinkedList<>(); 
        int capacity = 2; 
  
        // Function called by producer thread 
        public void produce() throws InterruptedException 
        { 
            int value = 0; 
            while (true) { 
                synchronized (this) 
                { 
                    // producer thread waits while list 
                    // is full 
                    while (list.size() == capacity) 
                        wait(); 
  
                    System.out.println("Producer produced-"
                                       + value); 
  
                    // to insert the jobs in the list 
                    list.add(value++); 
  
                    // notifies the consumer thread that 
                    // now it can start consuming 
                    notify(); 
  
                    // makes the working of program easier 
                    // to  understand 
                    Thread.sleep(1000); 
                } 
            } 
        } 
  
        // Function called by consumer thread 
        public void consume() throws InterruptedException 
        { 
            while (true) { 
                synchronized (this) 
                { 
                    // consumer thread waits while list 
                    // is empty 
                    while (list.size() == 0) 
                        wait(); 
  
                    // to retrive the ifrst job in the list 
                    int val = list.removeFirst(); 
  
                    System.out.println("Consumer consumed-"
                                       + val); 
  
                    // Wake up producer thread 
                    notify(); 
  
                    // and sleep 
                    Thread.sleep(1000); 
                } 
            } 
        } 
    } 
} 
////////////////////////////////////////////////////////////////////////////////////////


package nag;

import java.util.LinkedList;

public class ProducerConsumerExample {
  // Declare a field to store a LinkedList of integers
  private LinkedList<Integer> list = new LinkedList<>();
  
  // Declare a field to store the maximum size of the LinkedList
  private final int LIMIT = 10;
  
  // Declare a field to store an object for synchronization
  private Object lock = new Object();

  // Define a method to produce integers and add them to the LinkedList
  public void produce() throws InterruptedException {
    int value = 0; // Initialize a variable to store the integer value being produced
    while (true) { // Loop indefinitely
      synchronized (lock) { // Synchronize on the lock object
        // Check if the size of the LinkedList has reached the maximum size
        while (list.size() == LIMIT) {
          lock.wait(); // Wait on the lock object to release the lock and allow other threads to access the LinkedList
        }
        list.add(value); // Add the value to the LinkedList
        System.out.println("Produced: " + value); // Print the produced value
        value++; // Increment the value
        lock.notify(); // Notify the consumer thread that the LinkedList has been updated
      }
    }
  }

  // Define a method to consume integers from the LinkedList
  public void consume() throws InterruptedException {
    while (true) { // Loop indefinitely
      synchronized (lock) { // Synchronize on the lock object
        // Check if the LinkedList is empty
        while (list.size() == 0) {
          lock.wait(); // Wait on the lock object to release the lock and allow other threads to access the LinkedList
        }
        int value = list.removeFirst(); // Remove the first element from the LinkedList
        System.out.println("Consumed: " + value); // Print the consumed value
        lock.notify(); // Notify the producer thread that the LinkedList has been updated
      }
      Thread.sleep(1000); // Sleep for 1 second
    }
  }

  public static void main(String[] args) {
    // Create an instance of the ProducerConsumerExample class
    ProducerConsumerExample example = new ProducerConsumerExample();

    // Create a new thread to run the produce method
    Thread producerThread = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          example.produce(); // Call the produce method on the example object
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });

    // Create a new thread to run the consume method
    Thread consumerThread = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          example.consume(); // Call the consume method on the example object
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });

    // Start the producer and consumer threads
    producerThread.start();
    consumerThread.start();
  }
}
