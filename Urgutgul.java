public abstract class Urgutgul {

    private String make;
    private String model;
    private int year;
    private String fuelType;
    private double fuelEfficiency;
    
    // 🔹 New: fuel variable to track current fuel level
    private double fuel;

    public Vehicle(String make, String model, int year, String fuelType, double fuelEfficiency) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.fuelEfficiency = fuelEfficiency;
        this.fuel = 0.0; // 🔸 Initialize fuel to 0
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    // 🔹 Getter for current fuel level
    public double getFuel() {
        return fuel;
    }

    // 🔹 Method to refuel the vehicle
    public void refuel(double amount) {
        if (amount > 0) {
            this.fuel += amount;
            System.out.println("Refueled " + amount + " liters. Current fuel: " + this.fuel + " liters.");
        } else {
            System.out.println("Invalid fuel amount.");
        }
    }

    public abstract double calculateFuelEfficiency();

    public abstract double calculateDistanceTraveled();

    public abstract double getMaxSpeed();
}
