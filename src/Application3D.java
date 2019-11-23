public class Application3D {
    public static void main(String[] args) {

        Point3D[] points = new Point3D[3];
        points[0] = new Cylinder(1, 1, 2, 2, 3, 3);
        points[1] = new Cone(1, 2, 3, 4, 5, 6);
        points[2] = new Sphere(0, 1, 2, 2, 3, 3);

        for (Point3D point : points) {
            System.out.println(point);
            System.out.println("Perimeter = " + point.volume());
            System.out.println("Area = " + point.area());
        }
    }
}
