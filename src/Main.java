import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int year = getYear(dateTime);
        Month month = getMonth(dateTime);
        int dayOfTheMonth = getDayOfMonth(dateTime);
        DayOfWeek dayOfWeek = getDayOfWeek(dateTime);
        System.out.println("It's year: " + year +
                "\nMonth: " + month +
                "\nDay of the month: " + dayOfTheMonth +
                "\nDay of the week: " + dayOfWeek);
    }

    public static DayOfWeek getDayOfWeek(OffsetDateTime dateTime) {
        return dateTime.getDayOfWeek();
    }

    public static int getDayOfMonth(OffsetDateTime dateTime) {
        return dateTime.getDayOfMonth();
    }

    public static Month getMonth(OffsetDateTime dateTime) {
        return dateTime.getMonth();
    }

    public static int getYear(OffsetDateTime dateTime) {
        return dateTime.getYear();
    }
}