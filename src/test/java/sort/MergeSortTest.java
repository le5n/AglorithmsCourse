package sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void start() {
        int[] sortedArray1 = MergeSort.sort(new int[]{3, 4, 1, 2});
        int[] sortedArray2 = MergeSort.sort(new int[]{3, 4, 1, 2, 8});

        assertTrue(isSorted(sortedArray1));
        assertTrue(isSorted(sortedArray2));
    }

    private boolean isSorted(int[] array) {
        int[] sorted = new int[array.length];
        System.arraycopy(array, 0, sorted, 0, array.length);
        Arrays.sort(sorted);
        return Arrays.equals(sorted, array);
    }
}
