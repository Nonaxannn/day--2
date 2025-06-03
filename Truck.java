public class Truck extends Vehicle {
    private double cargoCapacity;
    private double distanceTraveled;
    private double maxSpeed;

    public Truck(String make, String model, int year, String fuelType, double fuelEfficiency,
                 double cargoCapacity, double distanceTraveled, double maxSpeed) {
        super(make, model, year, fuelType, fuelEfficiency);
        this.cargoCapacity = cargoCapacity;
        this.distanceTraveled = distanceTraveled;
        this.maxSpeed = maxSpeed;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
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
