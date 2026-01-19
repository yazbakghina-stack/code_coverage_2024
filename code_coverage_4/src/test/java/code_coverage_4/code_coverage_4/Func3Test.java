package code_coverage_4.code_coverage_4;

import static org.junit.Assert.assertThrows;

import org.junit.Test;
public class Func3Test {

    // T1 – בדיקה אחת מספיקה (חלוקה באפס מתרחשת בכל ריצה)
    @Test
    public void testT1() {
        assertThrows(ArithmeticException.class, () -> {
            Func3.func3(1);
        });
    }

}
