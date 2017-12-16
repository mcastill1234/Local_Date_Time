import java.time.*;

public class Local_DateTimes {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date-time is: " + currentDateTime);
        LocalDateTime secondAug2014 = LocalDateTime.of(2014, 10, 2, 12, 30);
        System.out.println("A past date-time is: " + secondAug2014);
    }
}
