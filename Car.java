public class Car extends Vehicle {
    private int numberOfDoors;
    private double distanceTraveled;
    private double maxSpeed;

    public Car(String make, String model, int year, String fuelType, double fuelEfficiency,
               int numberOfDoors, double distanceTraveled, double maxSpeed) {
        super(make, model, year, fuelType, fuelEfficiency);
        this.numberOfDoors = numberOfDoors;
        this.distanceTraveled = distanceTraveled;
        this.maxSpeed = maxSpeed;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public double calculateFuelEfficiency() {
        return getFuelEfficiency(); 
    }

    @Override
    public double calculateDistanceTraveled() {
        return distanceTraveled;
    }

    @Override
    public double getMaxSpeed() {
        return maxSpeed;
    }
}
