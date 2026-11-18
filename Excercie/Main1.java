package Excercie;
class Vehicle {
    String brand;
    int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void start() {
        System.out.println(brand + " vehicle is starting...");
    }
}

class Car extends Vehicle {
    int numDoors;

    public Car(String brand, int year, int numDoors) {
        super(brand, year);
        this.numDoors = numDoors;
    }

    public void honk() {
        System.out.println(brand + " car says: Beep beep!");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Generic", 2020);
        v.start();

        Car car = new Car("Toyota", 2023, 4);
        car.start(); // Inherited method
        car.honk();  // Car-specific method
    }
}