import java.time.*;

public class Local_Dates {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date is: " + currentDate);
        LocalDate tenthFeb2014 = LocalDate.of(2014, Month.FEBRUARY, 10);
        System.out.println("A past date is: " + tenthFeb2014);
        LocalDate sixtyFifthDayof2010 = LocalDate.ofYearDay(2010, 65);
        System.out.println("The 65th day of 2010 is: " + sixtyFifthDayof2010);
    }
}

