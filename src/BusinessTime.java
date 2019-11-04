import java.text.DateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class BusinessTime {

 /* Есть три рабочие смены:
    с 7:00 до 15:00
    с 15:00 до 23:00
    с 23:00 до 7:00
    Определить какая сейчас смена (относительно текущего времени)
    */

    public static void main (String [] args) {

        Teams firstTeam = new Teams("Первая смена", 07, 00,15,00);
        Teams secondTeam = new Teams("Вторая смена", 15, 00,23,00);
        Teams thirdTeam = new Teams("Третья смена", 23, 00,07,00);

        LocalTime autoTimeDetection = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Текущее время: " + formatter.format(autoTimeDetection));

        if (autoTimeDetection.isAfter(firstTeam.startTime) && autoTimeDetection.isBefore(firstTeam.endTime)) {
            System.out.println("\nСейчас работает: " + firstTeam.name);
        } else if (autoTimeDetection.isAfter(secondTeam.startTime) && autoTimeDetection.isBefore(secondTeam.endTime)) {
                System.out.println("\nСейчас работает: " + secondTeam.name);
            } else {System.out.println("\nСейчас работает: " + thirdTeam.name);}

    }

}
