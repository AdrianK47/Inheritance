public class Vehicle {
    private String brand;
    private int speed;

    //Constructor with and without parameters
    public Vehicle() {
        this.brand = "Unknown";
        this.speed = 0;
    }
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    //Accessor & Modifier methods
    public String getBrand() {
        return brand;
    }
    public int getSpeed() {
        return speed;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //Unique methods
    public String move() {
        return brand + " is moving at " + speed + " mph.";
    }
    public String stop() {
        return brand + " has stopped.";
    }

    //The toString and equals method
    public String toString() {
        return "Vehicle[Brand: " + brand + ", Speed: " + speed + "]";
    }
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Vehicle)){
            return false;
        }
        Vehicle v = (Vehicle) obj;
        return this.speed == v.speed && this.brand.equals(v.brand);
    }
}

class Car extends Vehicle {
    private int doors;

    //Constructor with and without parameters
    public Car() {
        super();
        this.doors = 4;
    }
    public Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    //Accessor & Modifier methods
    public int getDoors() {
        return doors;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }

    //Overridden method from parent class
    @Override
    public String move() {
        return super.getBrand() + " car is driving at " + super.getSpeed() + " mph.";
    }

    //Unique methods
    public String honk() {
        return "Honk! Honk!";
    }
    public String openDoors() {
        return "Opening " + doors + " doors.";
    }

    //The overridden toString and equals method
    @Override
    public String toString() {
        return super.toString() + ", Car[Doors: " + doors + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)){
            return false;
        }
        if (!(obj instanceof Car)){
            return false;
        }
        Car c = (Car) obj;
        return this.doors == c.doors;
    }
}
class ElectricCar extends Car {
    private int batteryCapacity;

    //Constructor with and without parameters
    public ElectricCar() {
        super();
        this.batteryCapacity = 50;
    }
    public ElectricCar(String brand, int speed, int doors, int batteryCapacity) {
        super(brand, speed, doors);
        this.batteryCapacity = batteryCapacity;
    }

    //Accessor & Modifier methods
    public int getBatteryCapacity() {
        return batteryCapacity;
    }
    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    //Overridden method from parent class
    @Override
    public String move() {
        return super.getBrand() + " electric car is silently moving at " + super.getSpeed() + " mph.";
    }

    //Unique methods
    public String charge() {
        return "Charging battery with " + batteryCapacity + " kWh.";
    }
    public String ecoMode() {
        return "Eco mode activated to save battery.";
    }

    //The overridden toString and equals method
    @Override
    public String toString() {
        return super.toString() + ", ElectricCar[Battery: " + batteryCapacity + " kWh]";
    }
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)){
            return false;
        }
        if (!(obj instanceof ElectricCar)){
            return false;
        }
        ElectricCar ec = (ElectricCar) obj;
        return this.batteryCapacity == ec.batteryCapacity;
    }
}