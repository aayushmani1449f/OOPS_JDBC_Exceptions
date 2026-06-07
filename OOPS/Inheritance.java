package OOPS;

// final class cannot be extended
final class FinalClass {
    void print() { System.out.println("I am final"); }
}

class Animal {
    String type = "Animal"; // Field to be hidden

    // final method cannot be overridden
    final void sleep() {
        System.out.println("Sleeping...");
    }

    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    // Field Hiding: This 'type' hides the 'type' in Animal
    String type = "Dog"; 

    Dog() {
        super(); // super() calls the parent class constructor
    }

    void showType() {
        System.out.println("Type here is: " + type); // Prints Dog
        System.out.println("Parent type is: " + super.type); // super keyword accesses parent's hidden field
    }

    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Inherited method
        dog.sleep(); // Inherited final method
        dog.bark();
        dog.showType(); // Demonstrates field hiding and super keyword

        // final keyword on variables
        final int MAX_SPEED = 50; 
        // MAX_SPEED = 60; // Error: cannot assign a value to final variable

        // instanceof operator
        if (dog instanceof Animal) {
            System.out.println("dog is an instance of Animal");
        }
    }
}
