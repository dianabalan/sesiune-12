package transport;

class Bicycle extends Vehicle implements Transport {

    private int gear;

    // constructor and other methods
    public Bicycle(String make, String model, int year, int gear) {
        super(make, model, year);
        this.gear = gear;
    }

    public void move() {
        System.out.println("Bicycle is moving. Gear: " + gear + ".");
    }

    public void stop() {
        System.out.println("Bicycle has stopped.");
    }

    public void checkFuel() {
        System.out.println("Bicycle does not have fuel. This feature is not available for this transport.");
    }
}