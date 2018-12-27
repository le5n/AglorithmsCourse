import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleMultiplicationTest {

    @Test
    public void multiplyTest() {
        int[] x = new int[]{1, 4};
        int[] y = new int[]{1, 5, 5, 4, 4, 7};
        int result = SimpleMultiplication.multiply(x, y);
        assertEquals(14 * 155447, result);
    }
}