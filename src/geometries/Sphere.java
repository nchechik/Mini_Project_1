package geometries;
public class Sphere {

    private Point3D _center;
    // ***************** Constructors ********************** //
    public Sphere();
    public Sphere (Sphere sphere);
    public Sphere(double radius, Point3D center);
    public Sphere(Map<String, String> attributes);
    // ***************** Getters/Setters ********************** //
    public Point3D getCenter();
    public void setCenter(Point3D center);
    // ***************** Operations ******************** //
    public List<Point3D> FindIntersections(Ray ray);
    public Vector getNormal(Point3D point);
    /*************************************************
     * FUNCTION
     * genPrime
     * PARAMETERS
     * int – highest possible prime value
     * RETURN VALUE
     * A (positive) integer: the highest prime number,
     * smaller than the integer received as parameter.
     * MEANING
     * This functions computes a prime number p, such that
     * 0 <= p <= PARAMETER
     * SEE ALSO
     * list of names of other functions in your system,
     * related to this function.
     **************************************************/

}
