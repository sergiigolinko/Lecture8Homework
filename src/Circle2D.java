class Circle2D extends Point2D {
    public double x1;
    public double y1;
    public double x2;
    public double y2;

    public Circle2D(double x1, double y1, double x2, double y2) {
        //дано координати центра кола і довільної його точки
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double perimeter() {
        double radius = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return 2 * Math.PI * radius;
    }

    public double area() {
        double radius = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle2D{" +
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

        Circle2D circle2D = (Circle2D) o;

        if (Double.compare(circle2D.x1, x1) != 0) return false;
        if (Double.compare(circle2D.y1, y1) != 0) return false;
        if (Double.compare(circle2D.x2, x2) != 0) return false;
        return Double.compare(circle2D.y2, y2) == 0;
    }


}
