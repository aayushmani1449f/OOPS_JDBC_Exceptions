public class Employee {
    int id;
    String name;
    String dept;
    int sal;

    public Employee(int id, String name, String dept, int sal) {
        if (sal < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", sal=" + sal +
                '}';
    }
}
