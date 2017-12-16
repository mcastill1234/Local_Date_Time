import java.time.*;

public class LDT_Uses {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2014, 2, 15);
        System.out.println("Some date: " + date);
        boolean isBefore = LocalDate.now().isBefore(date);
        System.out.println("Is now before some date: " + isBefore);
        Month february = date.getMonth();
        int februaryIntValue = february.getValue();
        int minLength = february.minLength();
        int maxLenght = february.maxLength();
        System.out.println("February is month #: " + februaryIntValue);
        System.out.println("February has min " + minLength + " days");
        System.out.println("February has max " + maxLenght + " days");
        Month firstMonthOfQ = february.firstMonthOfQuarter();
        System.out.println("The first month of the quarter that has february is: " + firstMonthOfQ);
        int year = date.getYear();
        System.out.println("Some date's year is: " + year);
        int dayOfYear = date.getDayOfYear();
        System.out.println("Some date's day of year is: " + dayOfYear);
        int lengthOfYear = date.lengthOfYear();
        System.out.println("Some date's length of year is: " + lengthOfYear);
        boolean isLeapYear = date.isLeapYear();
        System.out.println("Some date is leap yaer: " + isLeapYear);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println();
}
