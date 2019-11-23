class Square2D extends Point2D {
    public double x1;
    public double y1;
    public double x2;
    public double y2;

    public Square2D(double x1, double y1, double x2, double y2) {
        //дано координати протилежних вершин прямокутника
        //сторони прямокутника паралельні відносно осей координат
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double perimeter() {
        double a = Math.abs(x2 - x1);
        double b = Math.abs(y2 - y1);
        return 2 * (a + b);
    }

    public double area() {
        double a = Math.abs(x2 - x1);
        double b = Math.abs(y2 - y1);
        return a * b;
    }

    @Override
    public String toString() {
        return "Square2D{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square2D square2D = (Square2D) o;

        if (Double.compare(square2D.x1, x1) != 0) return false;
        if (Double.compare(square2D.y1, y1) != 0) return false;
        if (Double.compare(square2D.x2, x2) != 0) return false;
        return Double.compare(square2D.y2, y2) == 0;
    }


}
