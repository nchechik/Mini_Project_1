package primitives;

import com.sun.istack.internal.NotNull;

public class Point3D extends Point2D{
    private Coordinate _z;
    // ***************** Constructors ********************** //
    public Point3D(){super();_z=new Coordinate();};
    public Point3D(@NotNull Coordinate x, @NotNull Coordinate y, @NotNull Coordinate z){super(x,y);_z=new Coordinate(z);};
    public Point3D(double x, double y, double z){super(new Coordinate(x),new Coordinate(y)); _z=new Coordinate(z);};
    public Point3D(Point3D point3D)
    {
        this._x=point3D.getX();
        this._y=point3D.getY();
        this._z=point3D.getZ();
    };
    // ***************** Getters/Setters ********************** //
    @NotNull
    public Coordinate getZ(){return new Coordinate(_z);};
    public void setZ(@NotNull Coordinate _z){this._z=new Coordinate(_z);};
    // ***************** Administration ******************** //


    /*************************************************
     * FUNCTION
     * compareTo()
     * PARAMETERS
     * Point3D point3D
     * RETURN VALUE
     * 1
     * -1
     * 0
     * compere the distance's of this-Point3D and tha other Point3D from the origin
     * MEANING
     * if this_distance >other_distancereturn 1
     * if distance_this <distance_other return -1
     * if Point3D from the origin.
     * if distances are equal but not same coordinates return 0
     *
     * SEE ALSO
     * getDistanceFromOrigin(),
     * **************************************************/
    public int compareTo((@NotNull Point3D point3D)
    {


        double thisDistance=this.getDistanceFromOrigin();
        double otherDistance=point3D.getDistanceFromOrigin();

        if(thisDistance!=otherDistance)
        {
            return (thisDistance > otherDistance) ? 1 : -1;
        }
        // distances are equal but not same coordinates

        else if(_z.compareTo(point3D._z) != 0)
        {
            return _z.compareTo(point3D._z);
        }

        else if(_x.compareTo(point3D._x) != 0)
        {
            return _x.compareTo(point3D._x);
        }

        else if(_y.compareTo(point3D._y) != 0)
        {
            return _y.compareTo(point3D._y);
        }


        // equal
        return 0;


    };
    /*************************************************
     * FUNCTION
     * getDistanceFromOrigin()
     * PARAMETERS
     *
     * RETURN VALUE
     * A (positive) double: the sqre root of the x and y and z coordinate paw 2:sqre root( _x^2+_y^2+_z^2),
     * smaller than the integer received as parameter.
     * MEANING
     * This functions return the Distance Point2D from the origin.
     * sqre root( _x^2+_y^2+_z^2)
     * SEE ALSO
     * comperTo(),
     * **************************************************/
    @Override
    public double getDistanceFromOrigin()
    {
        return Math.sqrt(
                (_x.getCoordinate()*_x.getCoordinate())+
                        (_y.getCoordinate()*_y.getCoordinate())+
                                (_z.getCoordinate()*_z.getCoordinate())
        );
    }
    @Override
    public String toString()
    {
        return "X: " + getX().getCoordinate() +
                " Y: " + getY().getCoordinate() +
                " Z: " + getZ().getCoordinate();
    }
    // ***************** Operations ******************** //
    @NotNull
    /* * * * *  * * * */   public void add(Vector vector)
    {
       this._x.setCoordinate(this._x.getCoordinate()+ vector.getHead()._x.getCoordinate());
       this._y.setCoordinate(this._y.getCoordinate()+ vector.getHead()._y.getCoordinate());
       this._z.setCoordinate(this._z.getCoordinate()+ vector.getHead()._z.getCoordinate());

    };
    /* * * * *  * * * */   public void subtract(Vector vector)
    {
        this._x.setCoordinate(this._x.getCoordinate()- vector.getHead()._x.getCoordinate());
        this._y.setCoordinate(this._y.getCoordinate()- vector.getHead()._y.getCoordinate());
        this._z.setCoordinate(this._z.getCoordinate()- vector.getHead()._z.getCoordinate());

    };
    /* * * * *  * * * */   public double distance(@NotNull  Point3D point)
    {
       double xPart =Math.pow(this._x.getCoordinate()-point.getX().getCoordinate(),2);
       double yPart =Math.pow(this._y.getCoordinate()-point.getY().getCoordinate(),2);
       double zPart =Math.pow(this._z.getCoordinate()-point.getZ().getCoordinate(),2);

       return Math.sqrt(xPart + yPart + zPart);

    };
}
