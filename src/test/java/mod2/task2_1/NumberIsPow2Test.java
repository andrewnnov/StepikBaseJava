package mod2.task2_1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NumberIsPow2Test {

    @Test
    public void whenNumberIsPowerTwoTheTrue() {

        NumberIsPow2 numberIsPow2 = new NumberIsPow2();

        assertFalse(numberIsPow2.isPowerOfTwo(10));
        assertTrue(numberIsPow2.isPowerOfTwo(2));
        assertTrue(numberIsPow2.isPowerOfTwo(4));
        assertTrue(numberIsPow2.isPowerOfTwo(8));
        assertTrue(numberIsPow2.isPowerOfTwo(16));
    }
}
