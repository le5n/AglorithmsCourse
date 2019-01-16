package sort;

public class MergeSort {
    public static int[] sort(int[] arrray) {
        return sort(arrray, arrray.length);
    }

    private static int[] sort(int[] a, int n) {
        if (n < 2) {
            return a;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        return merge(sort(l, mid), sort(r, n - mid));
    }

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