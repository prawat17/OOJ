// Abstract class Bird
abstract class Bird {
    // Abstract method to represent flying behavior
    abstract void fly();

    // Abstract method to represent making a sound
    abstract void makeSound();
}

// Subclass Eagle
class Eagle extends Bird {
    // Implementation of fly method for Eagle
    @Override
    void fly() {
        System.out.println("Eagle flies high in the sky with powerful wings.");
    }

    // Implementation of makeSound method for Eagle
    @Override
    void makeSound() {
        System.out.println("Eagle makes a sharp, high-pitched sound.");
    }
}

// Subclass Hawk
class Hawk extends Bird {
    // Implementation of fly method for Hawk
    @Override
    void fly() {
        System.out.println("Hawk soars gracefully through the air using its keen eyesight.");
    }

    // Implementation of makeSound method for Hawk
    @Override
    void makeSound() {
        System.out.println("Hawk emits a distinctive cry while flying.");
    }
}

// Main class to test the Bird subclasses
public class BirdTest {
    public static void main(String[] args) {
        // Create instances of Eagle and Hawk
        Eagle eagle = new Eagle();
        Hawk hawk = new Hawk();

        // Demonstrate fly and makeSound methods for Eagle
        System.out.println("Eagle:");
        eagle.fly();
        eagle.makeSound();
        System.out.println();

        // Demonstrate fly and makeSound methods for Hawk
        System.out.println("Hawk:");
        hawk.fly();
        hawk.makeSound();
    }
}
