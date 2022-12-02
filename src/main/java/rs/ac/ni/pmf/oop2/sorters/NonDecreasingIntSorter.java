package rs.ac.ni.pmf.oop2.sorters;

import java.util.Arrays;
import java.util.List;

public class NonDecreasingIntSorter extends AbstractIntSorter
{
    public NonDecreasingIntSorter(Integer[] array)
    {
        super(array);
    }

    @Override
    protected boolean shouldSwap(int x, int y)
    {
        return x > y;
    }
}
