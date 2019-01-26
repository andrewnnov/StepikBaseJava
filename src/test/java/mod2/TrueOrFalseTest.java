package mod2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TrueOrFalseTest {

    @Test
    public void whenAllFalseThenTrue() {
        assertFalse(TrueOrFalse.booleanExpression(false, false, false, false));
        assertTrue(TrueOrFalse.booleanExpression(true, true, false, false));
        assertFalse(TrueOrFalse.booleanExpression(true, true, true, true));
    }
}
