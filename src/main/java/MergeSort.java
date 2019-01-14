public class MergeSort {
    private static int[] merge(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        for (int k = 0; k < result.length; k++) {
            if (i > first.length - 1) {
                result[k] = second[j];
                j++;
            } else if (j > second.length - 1) {
                result[k] = first[i];
                i++;
            } else if (first[i] < second[j]) {
                result[k] = first[i];
                i++;
            } else if (second[j] < first[i]) {
                result[k] = second[j];
                j++;
            } else if (second[j] == first[i]) {
                result[k] = first[i];
                result[k + 1] = second[j];
                k++;
                i++;
                j++;
            }
        }
        return result;
    }
}
