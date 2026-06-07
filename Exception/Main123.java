import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class Main123
{
    static void main() {
        try {
            Employee e1 = new Employee(1, "ayush", "devops", 50000);
            Employee e2 = new Employee(2, "prateek", "devops", 40000);
            Employee e3 = new Employee(3, "sita", "tester", 10000);
            Employee e4 = new Employee(4, "rohit", "developer", 5000);
            // Employee e5 = new Employee(5, "", "developer", -5000); // This will throw exception if uncommented

            List<Employee> list1 = Arrays.asList(e1, e2, e3, e4);

            List<Integer> ilist = list1.stream().filter(e -> e.dept == "devops").map(e -> e.sal + 10000).toList();
            for (Integer i : ilist) {
                System.out.println(i);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating employee: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}