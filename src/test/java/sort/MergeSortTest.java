package sort;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void mergeSortSmallInputTest() {
        int[] sortedArray1 = MergeSort.sort(new int[]{3, 4, 1, 2});
        int[] sortedArray2 = MergeSort.sort(new int[]{3, 4, 1, 2, 8});

        assertTrue(isSorted(sortedArray1));
        assertTrue(isSorted(sortedArray2));
    }

    @Test
    public void mergeSortLargeInputTest() {
        int[] array = new int[100000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100);
        }
        int[] sorted = MergeSort.sort(array);

        assertTrue(isSorted(sorted));
    }

    private boolean isSorted(int[] array) {
        int[] sorted = new int[array.length];
        System.arraycopy(array, 0, sorted, 0, array.length);
        Arrays.sort(sorted);
        return Arrays.equals(sorted, array);
    }
}
