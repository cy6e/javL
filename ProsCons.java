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


package nag;
import java.util.LinkedList;
public class sample {
// Declare a shared list and its capacity
private LinkedList<Integer> list;
private int capacity;
public sample(int capacity) {
// Initialize the shared list and its capacity
this.list = new LinkedList<>();
this.capacity = capacity;
}
public void produce() throws InterruptedException {
// Initialize the value to be produced
int value = 0;
// Run the loop indefinitely
while (true) {
// Synchronize on the Sample object to control access to the shared list
synchronized (this) {
// Wait if the shared list is already full
while (list.size() == capacity)
wait();
// Produce the value and add it to the shared list
System.out.println("Producer produced-" + value);
list.add(value++);
// Notify the consumer that a value is available
notify();
// Sleep for 1 second
Thread.sleep(1000);
}
}
}
public void consume() throws InterruptedException {
// Run the loop indefinitely
while (true) {
// Synchronize on the Sample object to control access to the shared list
synchronized (this) {
// Wait if the shared list is empty
while (list.size() == 0)
wait();
// Consume the first value from the shared list
int val = list.removeFirst();
System.out.println("Consumer consumed-" + val);
// Notify the producer that there is space available in the shared list
notify();
// Sleep for 1 second
Thread.sleep(1000);
}
}
}
public static void main(String[] args) {
// Create an instance of the Sample class with a capacity of 10
sample pc = new sample(10);
// Create the producer thread
Thread producer = new Thread(new Runnable() {
@Override
public void run() {
try {
// Run the produce method in the producer thread
pc.produce();
} catch (InterruptedException e) {
e.printStackTrace();
}
}
});
// Create the consumer thread
Thread consumer = new Thread(new Runnable() {
@Override
public void run() {
try {
// Run the consume method in the consumer thread
pc.consume();
} catch (InterruptedException e) {
e.printStackTrace();
}
}
});
// Start the producer and consumer threads
producer.start();
consumer.start();
}
}
