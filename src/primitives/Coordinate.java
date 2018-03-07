package primitives;
public class Coordinate {


    private double _coordinate;

    // ***************** Constructors ********************** //
    public Coordinate(){this._coordinate=0;};

    public Coordinate(double coordinate){this._coordinate=coordinate;};

    public Coordinate(Coordinate coordinate){this._coordinate=coordinate._coordinate;};

    // ***************** Getters/Setters ********************** //
    public double getCoordinate() {
        return 0;
    }

    public void setCoordinate(double coordinate){this._coordinate=coordinate;}

    // ***************** Administration ******************** //
    public int compareTo(Coordinate coordinate);

    // ***************** Operations ******************** //
    public void add(Coordinate coordinate);

    public void subtract(Coordinate coordinate);
}