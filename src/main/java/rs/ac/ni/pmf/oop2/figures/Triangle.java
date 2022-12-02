package rs.ac.ni.pmf.oop2.figures;

public class Triangle extends Figure
{
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c)
    {
        super(color, "TRIANGLE");

        this.a = a;
        this.b = b;
        this.c = c;

        validate();
    }

    private void validate()
    {
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a)
        {
            System.out.println("Invalid triangle!");
        }
    }

    public double area()
    {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double circumference()
    {
        return a + b + c;
    }

}
