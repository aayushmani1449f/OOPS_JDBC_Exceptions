package OOPS;

abstract class Vehicle {
    abstract void start(); // Abstract method

    void stop() { // Concrete method
        System.out.println("Vehicle stopped.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    void start() {
        System.out.println("Motorcycle starting...");
    }
}

interface Drivable {
    void drive();
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
