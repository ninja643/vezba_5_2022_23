package rs.ac.ni.pmf.oop2.figures;

import lombok.Getter;

@Getter
public class Circle extends Figure
{
    private double radius;

    public Circle(String color, double radius)
    {
        super(color, "CIRCLE");

        this.radius = radius;
    }

    @Override
    public double area()
    {
        return radius * radius * Math.PI;
    }

    @Override
    public double circumference()
    {
        return 2 * radius * Math.PI;
    }

    public String messageFromCircle()
    {
        return "Hi, I'm circle!";
    }
}
