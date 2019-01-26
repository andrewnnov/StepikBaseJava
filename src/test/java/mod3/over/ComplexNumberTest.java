package mod3.over;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ComplexNumberTest {

    @Test
    public void whenOverrideEqAndHCThenObjsEquals() {

        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);

        assertTrue(a.equals(b));
        assertTrue(a.hashCode() == b.hashCode());

    }
}
