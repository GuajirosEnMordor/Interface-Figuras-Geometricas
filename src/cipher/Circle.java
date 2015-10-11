package cipher;

import java.lang.Math;

public class Circle implements Shape{

    private double r;

    public Circle(){this.r=0.0;}

    public Circle (double r){this.r=r;}

    public double area(){return Math.PI*Math.pow(r, 2);}

    public double perimeter(){return 2*Math.PI*r;}
}
