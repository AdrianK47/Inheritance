import java.util.*;
public class VehicleTester {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        // Creating various Vehicle, Car, and ElectricCar objects
        Vehicle v1 = new Vehicle("Ford", 60);
        Vehicle v2 = new Vehicle("Toyota", 70);
        Car c1 = new Car("Honda", 80, 4);
        Car c2 = new Car("BMW", 90, 2);
        ElectricCar e1 = new ElectricCar("Tesla", 100, 4, 85);
        ElectricCar e2 = new ElectricCar("Nissan", 75, 4, 60);

        // Demonstrating aliasing
        Vehicle alias1 = e1; // Aliasing ElectricCar as Vehicle
        Vehicle alias2 = c1; // Aliasing Car as Vehicle
        Car alias3 = e2;     // Aliasing ElectricCar as Car

        // Cloaking examples
        Vehicle cloak1 = new Car("Chevy", 65, 2);
        Vehicle cloak2 = new ElectricCar("Lucid", 110, 4, 90);

        // Adding objects to ArrayList
        vehicles.add(v1);
        vehicles.add(v2);
        vehicles.add(c1);
        vehicles.add(c2);
        vehicles.add(e1);
        vehicles.add(e2);
        vehicles.add(alias1);
        vehicles.add(alias2);
        vehicles.add(alias3);
        vehicles.add(cloak1);
        vehicles.add(cloak2);

        // Printing the vehicles and demonstrating polymorphism
        for (Vehicle v : vehicles) {
            System.out.println(v.toString());
            System.out.println(v.move()); // Calls overridden method dynamically
        }
    }
}