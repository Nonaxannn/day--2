public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022, "Gasoline", 15.5, 4, 500.0, 180.0);
        Truck truck = new Truck("Volvo", "FH16", 2020, "Diesel", 8.5, 20000.0, 1200.0, 140.0);

        System.out.println("Car Fuel Efficiency: " + car.calculateFuelEfficiency());
        System.out.println("Truck Distance Traveled: " + truck.calculateDistanceTraveled());
    }
}
