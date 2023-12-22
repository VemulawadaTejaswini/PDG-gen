import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        try (Scanner sc = new Scanner(System.in)) {
            if (sc.hasNext()) {
                String s = sc.next();
                Date date = format.parse(s);
                switch (date.compareTo(format.parse("2019/04/30"))) {
                    case -1:
                    case 0:
                        System.out.println("Heisei");
                        break;
                    default:
                        System.out.println("TBD");
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
