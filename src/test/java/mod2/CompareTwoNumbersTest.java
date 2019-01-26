package mod2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompareTwoNumbersTest {

    @Test
    public void whenAllFalseThenTrue() {

        boolean expectedResult = true;
        assertEquals(expectedResult, CompareTwoNumbers.doubleExpression(0.1, 0.2, 0.3));
    }
}
