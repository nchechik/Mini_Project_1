package primitives;
public class Coordinate {


    private double _coordinate;

    // ***************** Constructors ********************** //
    public Coordinate(){this._coordinate=0;};

    public Coordinate(double coordinate){this._coordinate=coordinate;};

    public Coordinate(Coordinate coordinate){this._coordinate=coordinate._coordinate;};

    // ***************** Getters/Setters ********************** //
    public double getCoordinate() {
        return _coordinate;
    }

    public void setCoordinate(double coordinate){this._coordinate=coordinate;}

    // ***************** Administration ******************** //

    public int compareTo(Coordinate coordinate)
    {
        if(this._coordinate <coordinate._coordinate)return -1;
        if(this._coordinate>coordinate._coordinate)return 1;
        if(this._coordinate==coordinate._coordinate) return 0;
        return 0;
    };

    // ***************** Operations ******************** //
    public void add(Coordinate coordinate){this._coordinate+=coordinate._coordinate;}

    public void subtract(Coordinate coordinate){this._coordinate-=coordinate._coordinate;};
}