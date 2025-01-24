// Interface definition
interface Animal {
    // Abstract method that must be implemented by any class that implements this interface
    void speak();
    
    // Default method with a body (available in the interface)
    default void description() {
        System.out.println("This is an animal.");
    }
}

// First class implementing the Animal interface
public class Dog implements Animal {
    // Instance variable for Dog class
    private String name;

    // Constructor of Dog class
    public Dog(String name) {
        this.name = name;  // 'this' refers to the current instance of the Dog class
        System.out.println("Dog constructor called for " + name);
    }

    // Implementation of the abstract method speak() from the Animal interface
    @Override
    public void speak() {
        System.out.println("The dog barks!");
    }

    // Method to display the dog's name
    public void displayName() {
        System.out.println("Dog's name: " + this.name);  // Using 'this' to refer to the current object's name
    }

    // Method in Dog class calling the default description method from Animal interface
    public void showDescription() {
        description();  // Calls the default method from the Animal interface
    }
}

// Second class implementing the Animal interface
public class Cat implements Animal {
    // Instance variable for Cat class
    private String name;

    // Constructor of Cat class
    public Cat(String name) {
        this.name = name;  // 'this' refers to the current instance of the Cat class
        System.out.println("Cat constructor called for " + name);
    }

    // Implementation of the abstract method speak() from the Animal interface
    @Override
    public void speak() {
        System.out.println("The cat meows!");
    }

    // Method to display the cat's name
    public void displayName() {
        System.out.println("Cat's name: " + this.name);  // Using 'this' to refer to the current object's name
    }

    // Method in Cat class calling the default description method from Animal interface
    public void showDescription() {
        description();  // Calls the default method from the Animal interface
    }
}

// Superclass that provides common behavior for Dog and Cat classes
class Pet {
    protected String petType;

    // Constructor for Pet class
    public Pet(String petType) {
        this.petType = petType;  // Using 'this' to refer to the current instance
        System.out.println("Pet constructor called for a " + petType);
    }

    // Method to show pet type
    public void displayPetType() {
        System.out.println("This is a " + petType);
    }
}

// Main class to test the interface, multiple class calling, 'this' and 'super'
public class Main {
    public static void main(String[] args) {
        // Create a Dog object and test the functionality
        Dog dog = new Dog("Buddy");
        dog.speak();  // Calling the Dog class's speak method (overridden)
        dog.displayName();  // Calling method to display the dog's name
        dog.showDescription();  // Calling the default method from Animal interface
        
        // Create a Cat object and test the functionality
        Cat cat = new Cat("Whiskers");
        cat.speak();  // Calling the Cat class's speak method (overridden)
        cat.displayName();  // Calling method to display the cat's name
        cat.showDescription();  // Calling the default method from Animal interface
        
        // Creating Pet object and displaying pet type
        Pet myPet = new Pet("Rabbit");
        myPet.displayPetType();
    }
}
