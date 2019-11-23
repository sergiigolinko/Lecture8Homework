public class Application2D {
    public static void main(String[] args) {

        Point2D[] points = new Point2D[3];
        points[0] = new Circle2D(1, 1, 2, 2);
        points[1] = new Square2D(1, 2, 3, 4);
        points[2] = new Triangle2D(0, 1, 2, 2, 3, 3);

        for (Point2D point : points) {
            System.out.println(point);
            System.out.println("Perimeter = " + point.perimeter());
            System.out.println("Area = " + point.area());
        }
    }
}
