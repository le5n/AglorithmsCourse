import java.util.ArrayList;
import java.util.List;

public class SimpleMultiplication {
    public static int multiply(int[] first, int[] second) {
        List<Integer> results = new ArrayList<>();

        for (int i = second.length-1; i >= 0; i--) {
            List<Integer> tempResult = new ArrayList<>();
            for (int j = first.length-1; j >= 0; j--) {
                tempResult.add(second[i] * first[j]);
            }
            results.add(sumMultResults(tempResult));
        }

        return sumMultResults(results);
    }

    private static int sumMultResults(List<Integer> results) {
        int totalResult = 0;
        for (int i = 0; i < results.size(); i++) {
            totalResult = (int) (totalResult + results.get(i) * Math.pow(10, i));
        }
        return totalResult;
    }
}