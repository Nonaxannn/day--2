// Vehicle.java
// Parent class Vehicle

// Declare the abstract class Vehicle
public abstract class Vehicle {
    
    // Private instance variable for the make of the vehicle
    private String make;
    
    // Private instance variable for the model of the vehicle
    private String model;
    
    // Private instance variable for the year of the vehicle
    private int year;
    
    // Private instance variable for the fuel type of the vehicle
    private String fuelType;
    
    // Private instance variable for the fuel efficiency of the vehicle
    private double fuelEfficiency;

    // 🔹 NEW: Instance variable for the current amount of fuel in the tank
    private double fuel;

    // Constructor
    public Vehicle(String make, String model, int year, String fuelType, double fuelEfficiency) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.fuelEfficiency = fuelEfficiency;
        this.fuel = 0.0; // 🔸 Initialize fuel to 0.0 by default
    }

    // Getters
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

    // Abstract methods
    public abstract double calculateFuelEfficiency();

    public abstract double calculateDistanceTraveled();

    public abstract double getMaxSpeed();
}
