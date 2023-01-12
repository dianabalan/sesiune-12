package polyline;

class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object other) {
        Point anotherPoint = (Point) other;
        return this.x == anotherPoint.x && this.y == anotherPoint.y;
    }
}