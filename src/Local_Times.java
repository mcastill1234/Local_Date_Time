import java.time.*;

public class Local_Times {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time is: " + currentTime);
        LocalTime midday = LocalTime.of(12, 0);
        System.out.println("Midday time is: " + midday);
        LocalTime afterMidday = LocalTime.of(13,30,15);
        System.out.println("Time after midday is: " + afterMidday);
        LocalTime fromSecondsOfDay = LocalTime.ofSecondOfDay(12345);
        System.out.println("12345th second of day: " + fromSecondsOfDay);
        LocalTime currentTimeInLA = LocalTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Current time in LA: " + currentTimeInLA);
        LocalTime nowInUTC = LocalTime.now(Clock.systemUTC());
        System.out.println("Current time in UTC zone: " + nowInUTC);
    }
}
