class Cylinder extends Point3D {
    public double x1;
    public double y1;
    public double x2;
    public double y2;
    public double xh;
    public double yh;

    public Cylinder(double x1, double y1, double x2, double y2, double xh, double yh) {
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
        return Math.PI * radius * radius * height;
    }

    public double area() {
        double radius = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double height = Math.sqrt(Math.pow(xh - x1, 2) + Math.pow(yh - y1, 2));
        return 2 * Math.PI * radius * radius + 2 * Math.PI * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
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

        Cylinder cylinder = (Cylinder) o;

        if (Double.compare(cylinder.x1, x1) != 0) return false;
        if (Double.compare(cylinder.y1, y1) != 0) return false;
        if (Double.compare(cylinder.x2, x2) != 0) return false;
        if (Double.compare(cylinder.y2, y2) != 0) return false;
        if (Double.compare(cylinder.xh, xh) != 0) return false;
        return Double.compare(cylinder.yh, yh) == 0;
    }

}
