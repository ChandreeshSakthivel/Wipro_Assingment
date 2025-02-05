class Vehicle {    
    public void startEngine() {
        System.out.println("The vehicle's engine is starting");
    }
}
class Car extends Vehicle {
    public void startEngine() {
        System.out.println("Car engine starting with key ignition");
    }
}
class Motorcycle extends Vehicle {
        public void startEngine() {
        System.out.println("Motorcycle engine starting with button press");
    }
}
public class Vehicletest {
    public static void vehicleTestDrive(Vehicle vehicle) {
        vehicle.startEngine();
    }
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myMotorcycle = new Motorcycle();
        System.out.println("Testing Car:");
        vehicleTestDrive(myCar);
        System.out.println("\nTesting Motorcycle:");
        vehicleTestDrive(myMotorcycle);
    }
}

