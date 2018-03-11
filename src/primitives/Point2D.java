package primitives;

import com.sun.istack.internal.NotNull;

public class Point2D implements Comparable<Point2D>{
    protected Coordinate _x;
    protected Coordinate _y;

    // ***************** Constructors ********************** //
    public Point2D() {
        this._x=new Coordinate(0);
        this._y=new Coordinate(0);
    }


 Point2D(@NotNull Coordinate x,@NotNull Coordinate y) {
     this._x=new Coordinate(x);
     this._y=new Coordinate(y);
    }


 Point2D(@NotNull  Point2D point2D) {
     this._x=point2D.getX();
     this._y=point2D.getY();
    }

    // ***************** Getters/Setters ********************** //
    public Coordinate getX() {
        return _x;
    }

    public Coordinate getY(){
        return _y;
    };
    public void setX(Coordinate _x)
    {
        this._x= _x;
    };
    public void setY(Coordinate _y){
        this._y= _y;
    };;

    // ***************** Administration ******************** //

    /*************************************************
     * FUNCTION
     * compareTo()
     * PARAMETERS
     * Point2D point2D
     * RETURN VALUE
     * 1
     * -1
     * 0
     * compere the distance's of this-Point2D and tha other Point2D
     * MEANING
     * if this_distance >other_distancereturn 1
     * if distance_this <distance_other return -1
     * if Point2D from the origin.
     * if distances are equal but not same coordinates return 0
     *
     * SEE ALSO
     * getDistanceFromOrigin(),
     * **************************************************/
    public int compareTo(Point2D point2D) {
        double thisDistance=this.getDistanceFromOrigin();
        double otherDistance=point2D.getDistanceFromOrigin();

        if(thisDistance!=otherDistance)
        {
            return (thisDistance > otherDistance) ? 1 : -1;
        }
        // distances are equal but not same coordinates

        else if(_y.compareTo(point2D._y) != 0)
        {
            return _y.compareTo(point2D._y);
        }

        else if(_x.compareTo(point2D._x) != 0)
        {
            return _x.compareTo(point2D._x);
        }

        // equal
        return 0;

    }
    /*************************************************
     * FUNCTION
     * getDistanceFromOrigin()
     * PARAMETERS
     *
     * RETURN VALUE
     * A (positive) double: the sqre root of the x and y coordinate paw 2:sqre root( _x^2+_y^2),
     * smaller than the integer received as parameter.
     * MEANING
     * This functions return the Distance Point2D from the origin.
     * sqre root( _x^2+_y^2)
     * SEE ALSO
     * comperTo(),
     * **************************************************/
    public double getDistanceFromOrigin()
    {
        return Math.sqrt(
                (_x.getCoordinate()*_x.getCoordinate())+
                        (_y.getCoordinate()*_y.getCoordinate())
        );
    }
}
