package Excercie;
class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculateBonus() {
        return salary * 0.10; // 10%
    }
}

class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.20; // 20%
    }
}

class Intern extends Employee {
    public Intern(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.05; // 5%
    }
}

public class Main2 {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Alice", 50000),
            new Manager("Bob", 80000),
            new Intern("Charlie", 20000)
        };

        for (Employee e : employees) {
            System.out.println(e.name + "'s bonus: $" + e.calculateBonus());
        }
    }
}