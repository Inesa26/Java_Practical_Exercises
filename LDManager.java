import java.time.LocalDate;
import java.time.LocalDateTime;

public class LDManager {
    public static void main (String[] args){
        LocalDate x = LocalDate.of(1993,11,11);
        LocalDate y = x.plusWeeks(34);
        System.out.println (y.getDayOfYear());
        System.out.println(y.toEpochDay());
        LocalDateTime z = y.atTime(16,45);
        LocalDate birthdate =LocalDate.of(2013,07,17);
        LocalDate current = LocalDate.now();
        if(current.minusYears(18).isAfter(birthdate)) System.out.println("Persoana a implinit majoratul");
                else System.out.println("Persoana este minora");
    }
}