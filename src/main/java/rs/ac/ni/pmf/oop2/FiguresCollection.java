package rs.ac.ni.pmf.oop2;

import rs.ac.ni.pmf.oop2.figures.Figure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FiguresCollection
{
    private final List<Figure> figures = new ArrayList<>();

    private final Map<String, List<Figure>> figuresMap = new HashMap<>();

    public void addFigure(Figure figure)
    {
        // Add to list
        figures.add(figure);

        // Add to Map
        String figureType = figure.getType();
        List<Figure> currentList = figuresMap.get(figureType);
        if (currentList == null)
        {
            currentList = new ArrayList<>();
            figuresMap.put(figureType, currentList);
        }
        currentList.add(figure);
    }

    public double getTotalArea()
    {
        double totalArea = 0.0;

        for (final Figure figure : figures)
        {
            totalArea += figure.area();
        }

        return totalArea;
    }

    public int count(final String type)
    {
        int countByType = 0;

        for (final Figure figure : figures)
        {
            if (figure.getType().equals(type))
            {
                countByType++;
            }
        }

        return countByType;
    }

    public int countFromMap(final String type)
    {
        final List<Figure> figuresByType = figuresMap.get(type);
        if (figuresByType == null)
        {
            return 0;
        }

        return figuresByType.size();
    }
}
