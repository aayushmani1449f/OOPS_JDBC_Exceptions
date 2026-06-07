package OOPS;

// POJO (Plain Old Java Object): 
// A class that doesn't extend any special classes or implement special interfaces from a framework.
// It relies on Encapsulation (private fields, public getters/setters).
class Person {
    // Encapsulation: fields are hidden (private)
    private String name;
    private int age;

    // Public Getters and Setters to control access
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // Encapsulation allows adding validation
        if (age > 0) {
            this.age = age;
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person(); // Creating a POJO instance
        person.setName("Alice");
        person.setAge(25);
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
    }
}
