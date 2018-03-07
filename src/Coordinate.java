public class Coordinate {


    private double _coordinate;

    // ***************** Constructors ********************** //
    public Coordinate(){this._coordinate=0;};

    public Coordinate(double coordinate){this._coordinate=coordinate;};

    public Coordinate(Coordinate coordinate)

    // ***************** Getters/Setters ********************** //
    public double getCoordinate();

    public void setCoordinate(double coordinate)

    // ***************** Administration ******************** //
    public int compareTo(Coordinate coordinate);

    // ***************** Operations ******************** //
    public void add(Coordinate coordinate);

    public void subtract(Coordinate coordinate);
}