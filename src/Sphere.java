class Sphere extends Point3D {
    public double x1;
    public double y1;
    public double x2;
    public double y2;
    public double xh;
    public double yh;

    public Sphere(double x1, double y1, double x2, double y2, double xh, double yh) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.xh = xh;
        this.yh = yh;
    }

    public double volume() {
        double radius = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double height = Math.sqrt(Math.pow(xh - x1, 2) + Math.pow(yh - y1, 2));
        return 4 * Math.PI * radius * radius * radius / 3;
    }

    public double area() {
        double radius = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double height = Math.sqrt(Math.pow(xh - x1, 2) + Math.pow(yh - y1, 2));
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                ", xh=" + xh +
                ", yh=" + yh +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sphere sphere = (Sphere) o;

        if (Double.compare(sphere.x1, x1) != 0) return false;
        if (Double.compare(sphere.y1, y1) != 0) return false;
        if (Double.compare(sphere.x2, x2) != 0) return false;
        if (Double.compare(sphere.y2, y2) != 0) return false;
        if (Double.compare(sphere.xh, xh) != 0) return false;
        return Double.compare(sphere.yh, yh) == 0;
    }


}
