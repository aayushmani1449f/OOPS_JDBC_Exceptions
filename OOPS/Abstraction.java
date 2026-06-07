package OOPS;

// Abstraction using Abstract Class (Partial or Full Abstraction)
abstract class Vehicle {
    abstract void start(); // Abstract method (no body)

    void stop() { // Concrete method (has body)
        System.out.println("Vehicle stopped.");
    }
}

// Class vs Interface: A class extends another class (single inheritance)
class Motorcycle extends Vehicle {
    @Override
    void start() {
        System.out.println("Motorcycle starting...");
    }
}

// Abstraction using Interface (100% Abstraction traditionally, but Java 8+ allows default methods)
// Class vs Interface: A class implements an interface (multiple inheritance allowed)
interface Drivable {
    void drive(); // Abstract method by default
}

class ElectricCar implements Drivable {
    @Override
    public void drive() {
        System.out.println("Electric car driving silently...");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Vehicle myMoto = new Motorcycle();
        myMoto.start();
        myMoto.stop();

        Drivable myEv = new ElectricCar();
        myEv.drive();
    }
}
