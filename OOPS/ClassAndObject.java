package OOPS;

class Car {
    String brand;
    int year;

    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        Car myCar = new Car(); // Object creation
        myCar.brand = "Toyota";
        myCar.year = 2020;
        myCar.display();
    }
}
