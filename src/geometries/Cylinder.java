package geometries;
import com.sun.istack.internal.NotNull;
import primitives.Point3D;
import primitives.Vector;

public class Cylinder extends RadialGeometry {
    private Point3D _axisPoint;
    private Vector _axisDirection;
    // ***************** Constructors ********************** //
    public Cylinder()
    {
        this._axisPoint = new Point3D();
        this._axisDirection = new Vector();

    }
    public Cylinder(@NotNull Cylinder cylinder)
    {
        super(cylinder);
        this._axisDirection=cylinder._axisDirection;
        this._axisPoint=cylinder._axisPoint;
    };
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
