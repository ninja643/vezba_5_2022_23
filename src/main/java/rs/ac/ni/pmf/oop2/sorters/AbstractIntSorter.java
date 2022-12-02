package rs.ac.ni.pmf.oop2.sorters;

import java.util.Arrays;
import java.util.List;

public abstract class AbstractIntSorter
{
    private final Integer[] array;

    public AbstractIntSorter(Integer[] array)
    {
        this.array = array;
    }

    List<Integer> getSorted()
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            for (int j = i + 1; j < array.length; j++)
            {
                if (shouldSwap(array[i], array[j]))
                {
                    int pom = array[i];
                    array[i] = array[j];
                    array[j] = pom;
                }
            }
        }

        return Arrays.asList(array);
    }

    protected abstract boolean shouldSwap(int x, int y);
}
