package sort;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

public class SortTest {

    @Test
    public void mergeSortSmallInputTest() {
        int[] sortedArray1 = MergeSort.sort(new int[]{3, 4, 1, 2});
        int[] sortedArray2 = MergeSort.sort(new int[]{3, 4, 1, 2, 8});

        assertTrue(isSorted(sortedArray1));
        assertTrue(isSorted(sortedArray2));
    }

    @Test
    public void mergeSortLargeInputTest() {
        int[] sorted = MergeSort.sort(getLargeArray(100_000_000));

        assertTrue(isSorted(sorted));
    }


    @Test
    public void bubbleSortSmallInputTest() {
        int[] array = new int[]{5, 7, 2, 1, 8, 3, 7, 22, 15, 13, 1, 9};
        int[] sorted = BubleSort.sort(array);

        assertTrue(isSorted(sorted));
    }

    @Test
    public void BubbleSortLargeInputTest() {
        int[] sorted = BubleSort.sort(getLargeArray(100_000));

        assertTrue(isSorted(sorted));
    }

    @Test
    public void selectionSortSmallInputSize() {
        int[] array = new int[]{5, 7, 2, 1, 8, 3, 7, 22, 15, 13, 1, 9};
        int[] sorted = SelectionSort.sort(array);

        assertTrue(isSorted(sorted));
    }

    @Test
    public void selectionSortLargeInputSize() {
        int[] sorted = SelectionSort.sort(getLargeArray(100_000));

        assertTrue(isSorted(sorted));
    }

    private int[] getLargeArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100);
        }
        return array;
    }

    private boolean isSorted(int[] array) {
        int[] sorted = new int[array.length];

        System.arraycopy(array, 0, sorted, 0, array.length);
        Arrays.sort(sorted);

        return Arrays.equals(sorted, array);
    }

}
