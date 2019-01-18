package sort;

public class InsertionSort {
    public static int[] sort(int[] array) {
        int start = 0;
        while (start != array.length - 1) {
            int minIndex = start;
            for (int i = start; i < array.length; i++) {
                if (array[i] <= array[minIndex]) {
                    minIndex = i;
                }
            }
            swap(array, start, minIndex);
            start++;
        }
        return array;
    }

    private static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
