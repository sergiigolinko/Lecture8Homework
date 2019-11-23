class Triangle2D extends Point2D {
    public double x1;
    public double y1;
    public double x2;
    public double y2;
    public double x3;
    public double y3;

    public Triangle2D(double x1, double y1, double x2, double y2, double x3, double y3) {
        //дано координати вершин трикутника
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    public double perimeter() {
        double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double b = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        double c = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        return a + b + c;
    }

    public double area() {
        double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double b = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        double c = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String toString() {
        return "Triangle2D{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                ", x3=" + x3 +
                ", y3=" + y3 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle2D that = (Triangle2D) o;

        if (Double.compare(that.x1, x1) != 0) return false;
        if (Double.compare(that.y1, y1) != 0) return false;
        if (Double.compare(that.x2, x2) != 0) return false;
        if (Double.compare(that.y2, y2) != 0) return false;
        if (Double.compare(that.x3, x3) != 0) return false;
        return Double.compare(that.y3, y3) == 0;
    }


}
