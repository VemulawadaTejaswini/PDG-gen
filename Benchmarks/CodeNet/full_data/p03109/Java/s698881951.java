import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws ParseException {
        final String input = new Scanner(System.in).nextLine();
        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        final Date inputDate = sdf.parse(input);
        final Date borderDate = sdf.parse("2019/04/30");;
        if (inputDate.compareTo(borderDate) == 0) {
            System.out.println("Heisei");
        } else if (inputDate.compareTo(borderDate) == -1) {
            System.out.println("Heisei");
        } else {
            System.out.println("TBD");
        }
    }
}