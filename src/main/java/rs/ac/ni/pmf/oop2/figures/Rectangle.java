package rs.ac.ni.pmf.oop2.figures;

public class Rectangle extends Figure
{
    private double a;
    private double b;

    public Rectangle(String color, double a, double b)
    {
        super(color, "RECTANGLE");

        this.a = a;
        this.b = b;
    }

    public double area()
    {
        return a * b;
    }

    public double circumference()
    {
        return 2 * (a + b);
    }
}
