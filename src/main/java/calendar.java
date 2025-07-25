import java.util.Calendar;

public class calendar {

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1); // java counts months from index 0
        calendar.set(Calendar.DAY_OF_MONTH, day);

        String[] daysName = {"SUNDAY",
                "MONDAY",
                "TUESDAY",
                "WEDNESDAY",
                "THURSDAY",
                "FRIDAY",
                "SATURDAY"};

        int weekDay = calendar.get(Calendar.DAY_OF_WEEK);
        return daysName[weekDay - 1].toLowerCase();

    }

    public static void main(String[] args) {
        System.out.println("Today is: "+(findDay(07, 25, 2025)));
    }

}


