package geometries;
public class Cylinder {
    private Point3D _axisPoint;
    private Vector _axisDirection;
    // ***************** Constructors ********************** //
    public Cylinder();
    public Cylinder(Cylinder cylinder);
    public Cylinder(double radius, Point3D axisPoint, Vector axisDirection);
    // ***************** Getters/Setters ********************** //
    public Point3D getAxisPoint();
    public Vector getAxisDirection();
    public void setAxisPoint(Point3D axisPoint);
    public void setAxisDirection(Vector axisDirection);
    // ***************** Operations ******************** //
    public List<Point3D> FindIntersections(Ray ray);
    public Vector getNormal(Point3D point);

}