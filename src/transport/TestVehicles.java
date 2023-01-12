package transport;

public class TestVehicles {

    public static void main(String[] args) {
        Transport[] vehicles = new Transport[3];

        vehicles[0] = new Bicycle("bmx", "model1", 2020, 6);
        vehicles[1] = new Car("audi", "a8", 2016, 100);
        vehicles[2] = new Train("accelerat", "model2", 2000, 80);

        for (Transport transport : vehicles) {
            transport.move();
            transport.stop();
            transport.checkFuel();
        }
    }
}
