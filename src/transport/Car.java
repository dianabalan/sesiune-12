package transport;

class Car extends Vehicle implements Transport {

    private double fuelLevel;

    // constructor and other methods
    public Car(String make, String model, int year, double fuelLevel) {
        super(make, model, year);
        this.fuelLevel = fuelLevel;
    }

    public void move() {
        fuelLevel -= 0.5;
        System.out.println("Car is moving. Fuel level: " + fuelLevel + " gallons.");
    }

    public void stop() {
        System.out.println("Car has stopped.");
    }

    public void checkFuel() {
        System.out.println("Current fuel level: " + fuelLevel + " gallons.");
    }
}