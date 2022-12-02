package rs.ac.ni.pmf.oop2.sorters;

public class NonIncreasingIntSorter extends AbstractIntSorter
{
    public NonIncreasingIntSorter(Integer[] array)
    {
        super(array);
    }

    @Override
    protected boolean shouldSwap(int x, int y)
    {
        return x < y;
    }
}
