package mod2.task2_1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TrueOrFalseTest {

    @Test
    public void whenAllFalseThenTrue() {

        boolean expectedResult = false;
        assertEquals(expectedResult, TrueOrFalse.booleanExpression(false, false, false, false));
    }
}
