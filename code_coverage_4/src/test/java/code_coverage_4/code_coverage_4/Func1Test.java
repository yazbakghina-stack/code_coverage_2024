package code_coverage_4.code_coverage_4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class Func1Test {

    // T1: x=1, y=1, z=10 → פלט 0
    @Test
    public void testT1() {
        int result = Func1.func1(1, 1, 10);
        assertEquals(0, result);
    }

    //     T2: x=0, y=0, z=10 → חריגה ArithmeticException
    @Test
    public void testT2() {
        assertThrows(ArithmeticException.class, () -> {
            Func1.func1(0, 0, 10);
        });
    }
}

