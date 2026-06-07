package OOPS;

class MathOperations {
    // Method Overloading (Compile-time Polymorphism)
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    // Method Overriding (Run-time Polymorphism)
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println("Sum of integers: " + math.add(5, 10));
        System.out.println("Sum of doubles: " + math.add(5.5, 10.5));

        Shape shape = new Circle();
        shape.draw(); // Calls the overridden method in Circle
    }
}
