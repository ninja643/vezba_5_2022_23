package rs.ac.ni.pmf.oop2.figures;

import lombok.Getter;

@Getter
public abstract class Figure
{
    private static int idGenerator;

    private final int id;
    private final String color;
    private final String type;

    public Figure(String color, String type)
    {
        id = ++idGenerator;
        this.color = color;
        this.type = type;
    }

    public abstract double area();

    public abstract double circumference();

    public String generateStatistics()
    {
        return String.format("type: %s, color: %s, area: %f, circumference: %f", type, color, area(), circumference());
    }
}
