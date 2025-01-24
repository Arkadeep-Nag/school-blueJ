// Superclass: Animal
public class Animal {
    protected String name;

    // Constructor of Animal class
    public Animal(String name) {
        this.name = name;  // 'this' refers to the current object
        System.out.println("Animal constructor called for " + name);
    }

    // Method in the Animal class
    public void speak() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass: Dog that extends Animal
public class Dog extends Animal {
    private String breed;

    // Constructor of Dog class
    // Using super() to call the constructor of Animal class
    public Dog(String name, String breed) {
        super(name);  // Calls Animal constructor to initialize 'name' in the superclass
        this.breed = breed;  // 'this' refers to the current Dog object
        System.out.println("Dog constructor called for " + name + ", Breed: " + breed);
    }

    // Method overriding the speak() method from Animal class
    @Override
    public void speak() {
        System.out.println("The dog barks!");
    }

    // Additional method to display breed
    public void displayBreed() {
        System.out.println("The dog's breed is: " + this.breed);
    }
}

// Subclass: Cat that extends Animal
public class Cat extends Animal {
    private String color;

    // Constructor of Cat class
    // Using super() to call the constructor of Animal class
    public Cat(String name, String color) {
        super(name);  // Calls Animal constructor to initialize 'name' in the superclass
        this.color = color;  // 'this' refers to the current Cat object
        System.out.println("Cat constructor called for " + name + ", Color: " + color);
    }

    // Method overriding the speak() method from Animal class
    @Override
    public void speak() {
        System.out.println("The cat meows!");
    }

    // Additional method to display color
    public void displayColor() {
        System.out.println("The cat's color is: " + this.color);
    }
}

// Main class to test the use of extends and super()
public class Main {
    public static void main(String[] args) {
        // Creating Dog object
        Dog dog = new Dog("Buddy", "Golden Retriever");
        dog.speak();  // Calls Dog's speak method (overridden)
        dog.displayBreed();  // Calls Dog-specific method
        
        // Creating Cat object
        Cat cat = new Cat("Whiskers", "Gray");
        cat.speak();  // Calls Cat's speak method (overridden)
        cat.displayColor();  // Calls Cat-specific method
    }
}
