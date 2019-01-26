package mod2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharExpressionTest {

    @Test
    public void whenCharPlusIntThenNewChar() {
        CharExpression charExpression = new CharExpression();

        int a = 1;
        charExpression.charExpression(a);

        assertEquals(']', charExpression.charExpression(a));
    }

}
