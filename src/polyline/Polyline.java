package polyline;

import java.util.Arrays;

class Polyline {

    private Point[] points;
    private int size;

    public Polyline() {
        this.points = new Point[10];
        this.size = 0;
    }

    public void removePoint(int x, int y){

    }

    public void removePoint(Point point){

    }

    public void addPoint(Point point) {
        if (size > 0 && points[0].equals(point)) {
            System.out.println("Polyline closed");
            points[size++] = point;
            return;
        }

        for (int i = 1; i < size; i++) {
            if (points[i].equals(point)) {
                System.out.println("Point already exists");
                return;
            }
        }

        points[size++] = point;
    }

    @Override
    public String toString() {
        return "Polyline: " + Arrays.toString(Arrays.copyOfRange(points, 0, size ));
    }
}