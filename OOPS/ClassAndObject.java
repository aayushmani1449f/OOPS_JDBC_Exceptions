package OOPS;

// Classes vs Objects: Car is a Class (a blueprint).
class Car {
    // Access Modifiers & Instance vs Class Variables:
    public String brand;        // Instance variable (belongs to an object), public access
    private int year;           // Instance variable, private access (only accessible within this class)
    static int totalCars = 0;   // Class/Static variable (belongs to the class itself)

    // Constructors:
    // Default constructor
    public Car() {
        this("Unknown", 0); // this() used to call another constructor (Constructor Overloading)
    }

    // Parameterized constructor
    public Car(String brand, int year) {
        this.brand = brand;     // 'this' keyword used to refer to the current instance variable
        this.year = year;
        totalCars++;            // Accessing static variable
    }

    // Instance vs Class Methods:
    // Instance method (requires an object to be called)
    public void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }

    // Static method (belongs to the class, can be called without an object)
    public static void displayTotalCars() {
        System.out.println("Total Cars Built: " + totalCars);
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        // Objects: myCar and anotherCar are Objects (instances of the Car Class).
        Car myCar = new Car("Toyota", 2020); 
        Car anotherCar = new Car(); // Uses default constructor

        // Calling instance methods on objects
        myCar.display();
        anotherCar.display();

        // Calling static method on the Class itself
        Car.displayTotalCars();
    }
}
