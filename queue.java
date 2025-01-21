// Queue.java
public class Queue {
    private int[] queueArray;
    private int front;
    private int rear;
    private static final int MAX_SIZE = 10;  // Maximum size of the queue

    // Constructor to initialize the queue
    public Queue() {
        queueArray = new int[MAX_SIZE];
        front = -1;  // Queue is initially empty
        rear = -1;
    }

    // Enqueue: Add an element to the rear of the queue
    public void enqueue(int value) {
        if (rear < MAX_SIZE - 1) {
            if (front == -1) {
                front = 0;  // Set front to 0 if it's the first element
            }
            queueArray[++rear] = value;  // Increment rear and add the value
            System.out.println("Enqueued " + value + " into the queue.");
        } else {
            System.out.println("Queue overflow! Cannot enqueue " + value);
        }
    }

    // Dequeue: Remove and return the front element of the queue
    public int dequeue() {
        if (!isEmpty()) {
            int dequeuedValue = queueArray[front++];
            if (front > rear) {  // If the queue is empty after dequeueing
                front = rear = -1;  // Reset the queue
            }
            System.out.println("Dequeued " + dequeuedValue + " from the queue.");
            return dequeuedValue;
        } else {
            System.out.println("Queue underflow! Queue is empty.");
            return -1;  // Return -1 if the queue is empty
        }
    }

    // Peek: View the front element without removing it
    public int peek() {
        if (!isEmpty()) {
            return queueArray[front];
        } else {
            System.out.println("Queue is empty.");
            return -1;  // Return -1 if the queue is empty
        }
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == -1;
    }

    // Get the current size of the queue
    public int size() {
        if (isEmpty()) {
            return 0;
        } else {
            return rear - front + 1;
        }
    }

    // Display all elements in the queue
    public void display() {
        if (!isEmpty()) {
            System.out.println("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queueArray[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Queue is empty.");
        }
    }
}

// Main.java to test the Queue
public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();  // Create a new queue

        queue.enqueue(10);  // Enqueue some values
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display();  // Display all queue elements

        queue.dequeue();  // Dequeue a value
        queue.display();

        System.out.println("Peek front: " + queue.peek());  // Peek at the front element
        System.out.println("Queue size: " + queue.size());  // Display the current size of the queue
    }
}
