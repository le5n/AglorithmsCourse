package sort;

public class BubleSort {
    public static int[] sort(int[] array) {
        int shuffle = -1;

        while (shuffle != 0) {
            shuffle = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] < array[i]) {
                    swap(array, i, i + 1);
                    shuffle++;
                }
            }
        }
        return array;
    }

    private static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
