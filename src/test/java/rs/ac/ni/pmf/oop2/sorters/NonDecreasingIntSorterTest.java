package rs.ac.ni.pmf.oop2.sorters;

import org.junit.jupiter.api.Test;

import java.util.List;

class NonDecreasingIntSorterTest
{
    @Test
    public void shouldSort()
    {
        final Integer[] array = new Integer[] {3, 6, 4, 1, 1, 2, 7, 9, 3};
        final NonDecreasingIntSorter nonDecreasingIntSorter = new NonDecreasingIntSorter(array);
        final NonIncreasingIntSorter nonIncreasingIntSorter = new NonIncreasingIntSorter(array);

        printSorted(nonDecreasingIntSorter);
        printSorted(nonIncreasingIntSorter);
    }

    private void printSorted(AbstractIntSorter sorter)
    {
        final List<Integer> sortedList = sorter.getSorted();

        for (final Integer x : sortedList)
        {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}