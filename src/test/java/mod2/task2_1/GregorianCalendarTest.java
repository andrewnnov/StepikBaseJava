package mod2.task2_1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GregorianCalendarTest {

    @Test
    public void whenIsYearThenNumberOfYears() {

        GregorianCalendar gregorianCalendar = new GregorianCalendar();

        assertEquals(24, gregorianCalendar.leapYearCount(100));
    }
}
