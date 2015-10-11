package cipher;

public class Triangle implements Shape{
    private double a, b, c;

    public Triangle(){
        this.a=0.0;
        this.b=0.0;
        this.c=0.0;
    }

    public Triangle (double a, double b, double c){
        this.a= a;
        this.b=b;
        this.c=c;
    }

    public double area() {
        double halfBase = b/2;
        double hypo = a;
        double h = (Math.sqrt((Math.pow(2,hypo))-(Math.pow(2,halfBase))));
        return (b * h)/2;
    }

    public double perimeter(){
        return a+b+c;
    }
}
