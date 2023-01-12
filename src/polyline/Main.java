package polyline;

public class Main {

    public static void main(String[] args) {
        Polyline polyline = new Polyline();

        polyline.addPoint(new Point(1, 2));
        polyline.addPoint(new Point(3, 4));
        polyline.addPoint(new Point(7, 8));
        polyline.addPoint(new Point(3, 4)); // prints "Start point is equal to end point"
        polyline.addPoint(new Point(1, 2)); // prints polyline closed

        System.out.println(polyline);
    }
}
