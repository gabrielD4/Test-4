import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main testing = new Main();

    @Test
   void testGetDayOfWeek() {
        String date = "2023-03-01T13:00:00Z";
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        DayOfWeek dayOfWeek = Main.getDayOfWeek(dateTime);
        assertEquals(dateTime.getDayOfWeek(), dayOfWeek);
    }

    @Test
    void testGetDayOfMonth() {
        String date = "2023-03-01T13:00:00Z";
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int dayOfMonth = Main.getDayOfMonth(dateTime);
        assertEquals(1, dayOfMonth);
    }

    @Test
    void testGetMonth() {
        String date = "2023-03-01T13:00:00Z";
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        Month month = Main.getMonth(dateTime);
        assertEquals(dateTime.getMonth(), month);
    }

    @Test
    void testGetYear() {
        String date = "2023-03-01T13:00:00Z";
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int year = Main.getYear(dateTime);
        assertEquals(2023, year);
    }
}