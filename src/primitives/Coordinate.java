package primitives;

import com.sun.istack.internal.NotNull;

public class Coordinate implements Comparable<Coordinate> {

// u see it??????????????????????

    private double _coordinate=0.0;

    // ***************** Constructors ********************** //
    public Coordinate(){this._coordinate=0;};

    public Coordinate(double coordinate)
    {
        this._coordinate=coordinate;
    }

    public Coordinate(@NotNull Coordinate coordinate)
    {
        this._coordinate=coordinate._coordinate;
    };

    // ***************** Getters/Setters ********************** //
    public double getCoordinate() {
        return _coordinate;
    }

    public void setCoordinate(double coordinate){this._coordinate=coordinate;}

    // ***************** Administration ******************** //
    // lower value comes first in sorting
    @Override
    public int compareTo(Coordinate coordinate)
    {
        return Double.compare(this._coordinate, coordinate._coordinate);

    };

    // ***************** Operations ******************** //
    public void add(Coordinate coordinate){this._coordinate+=coordinate._coordinate;}

    public void subtract(Coordinate coordinate){this._coordinate-=coordinate._coordinate;};
}