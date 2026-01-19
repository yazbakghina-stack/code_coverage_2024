package code_coverage_4.code_coverage_4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class Func2Test {

    // T1 – ענף TRUE (p != 0)
    @Test
    public void testT1() {
        String result = Func2.func2(2.0f, 20.0f);
        assertEquals("p=12.00, q=1.67", result);
    }

    // T2 – ענף FALSE (p == 0) → חלוקה ב־0
    @Test
    public void testT2() {
        String result = Func2.func2(0.0f, 20.0f);
        assertTrue(result.contains("Infinity"));
    }

}
