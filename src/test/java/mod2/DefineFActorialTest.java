package mod2;

import org.junit.Test;

import java.math.BigInteger;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class DefineFActorialTest {

    @Test
    public void whenCharPlusIntThenNewChar() {
        DefineFactorial defineFactorial = new DefineFactorial();
        BigInteger value1 = new BigInteger("10888869450418352160768000000");

        assertEquals(BigInteger.valueOf(2), defineFactorial.factorial(2));
        assertEquals(BigInteger.valueOf(24), defineFactorial.factorial(4));
        assertEquals(BigInteger.valueOf(120), defineFactorial.factorial(5));

        assertThat(value1, is(defineFactorial.factorial(27)));



    }
}
