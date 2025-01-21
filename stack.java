// Stack.java
public class Stack {
    private int[] stackArray;
    private int top;
    private static final int MAX_SIZE = 10;  // Maximum size of the stack

    // Constructor to initialize the stack
    public Stack() {
        stackArray = new int[MAX_SIZE];
        top = -1;  // Stack is initially empty
    }

    // Push an element onto the stack
    public void push(int value) {
        if (top < MAX_SIZE - 1) {
            stackArray[++top] = value;  // Increment top and add the value
            System.out.println("Pushed " + value + " onto the stack.");
        } else {
            System.out.println("Stack overflow! Cannot push " + value);
        }
    }

    // Pop an element from the stack
    public int pop() {
        if (!isEmpty()) {
            int poppedValue = stackArray[top--];  // Retrieve the top value and decrement top
            System.out.println("Popped " + poppedValue + " from the stack.");
            return poppedValue;
        } else {
            System.out.println("Stack underflow! Stack is empty.");
            return -1;  // Return -1 if the stack is empty
        }
    }

    // Peek at the top element without removing it
    public int peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty.");
            return -1;  // Return -1 if the stack is empty
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Get the current size of the stack
    public int size() {
        return top + 1;
    }

    // Display all elements in the stack
    public void display() {
        if (!isEmpty()) {
            System.out.println("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Stack is empty.");
        }
    }
}

// Main.java to test the Stack
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();  // Create a new stack

        stack.push(10);  // Push some values onto the stack
        stack.push(20);
        stack.push(30);

        stack.display();  // Display all stack elements

        stack.pop();  // Pop a value
        stack.display();

        System.out.println("Peek top: " + stack.peek());  // Peek at the top element
        System.out.println("Stack size: " + stack.size());  // Display the current size of the stack
    }
}
