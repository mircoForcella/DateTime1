import java.time.LocalDate;

public class DateTime1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.print("Days left till the end of the month: ");
        System.out.println(today.lengthOfMonth() - today.getDayOfMonth());
        System.out.print("Days left till the end of the year: ");
        System.out.println(today.lengthOfYear() - today.getDayOfYear());
    }
}
