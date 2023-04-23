import org.junit.jupiter.api.*;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class WeekdaysTest {
    public String getDay(Integer dayNumber) {
        ArrayList<String> daysList = new ArrayList<>();
        daysList.add("Sunday");
        daysList.add("Monday");
        daysList.add("Tuesday");
        daysList.add("Wednesday");
        daysList.add("Thursday");
        daysList.add("Friday");
        daysList.add("Saturday");
        if (dayNumber == null) {
            throw new NullPointerException();
        } else if (dayNumber < 1) {
            return "The number should be equal or larger than 1";
        } else if (dayNumber > 7) {
            return "The number should be equal or smaller than 7";
        } else {
            return daysList.get(dayNumber - 1);
        }
    }

    @Test
    public void AllDaysHaveCorrectReturnValues() {
        assertEquals("Sunday", getDay(1));
        assertEquals("Monday", getDay(2));
        assertEquals("Tuesday", getDay(3));
        assertEquals("Wednesday", getDay(4));
        assertEquals("Thursday", getDay(5));
        assertEquals("Friday", getDay(6));
        assertEquals("Saturday", getDay(7));
    }

    @Test
    @DisplayName(value = "Nullpointer error test")
    public void throwNullPointerException() {
        assertThrows(NullPointerException.class, () -> getDay(null));
    }

    @Test
  public void dayNotExistReturnErrorValue() {
        assertEquals("The number should be equal or larger than 1", getDay(0));
        assertEquals("The number should be equal or smaller than 7", getDay(8));
    }

}
