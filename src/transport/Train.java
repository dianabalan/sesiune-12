package transport;

class Train extends Vehicle implements Transport {

    double fuelLevel;

    // constructor and other methods
    public Train(String name, String model, int year, double fuelLevel) {
        super(name, model, year);
        this.fuelLevel = fuelLevel;
    }

    public void move() {
        fuelLevel -= 1;
        System.out.println("Train is moving. Fuel level: " + fuelLevel + " gallons.");
    }

    public void stop() {
        System.out.println("Train has stopped.");
    }

    public void checkFuel() {
        System.out.println("Current fuel level: " + fuelLevel + " gallons.");
    }
}