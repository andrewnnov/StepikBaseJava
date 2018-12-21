package mod2.task2_1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringPalindromTest {

    @Test
    public void whenCharPlusIntThenNewChar() {
        StringPalindrom stringPalindrom = new StringPalindrom();

        String text = "Madam, I'm Adam!";
        assertEquals(true, stringPalindrom.isPalindrome(text));
    }

}
