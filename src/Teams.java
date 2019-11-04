import java.time.LocalDate;
import java.time.LocalTime;

public class Teams {

    protected String name;
    protected int startHours, startMinutes;
    protected int endHours, endMinutes;
    protected LocalTime startTime;
    protected LocalTime endTime;

    public Teams(String name, int startHours, int startMinutes, int endHours, int endMinutes) {
        this.name = name;
        this.startTime = LocalTime.of(startHours, startMinutes);
        this.endTime = LocalTime.of(endHours, endMinutes);
    }

}
