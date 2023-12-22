import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        sc.close();

        Date in = DateFormat.getDateInstance().parse(str);
        Date date = DateFormat.getDateInstance().parse("2019/04/30");

        if (in.compareTo(date) <= 0) {
            System.out.println("Heisei");
        } else {
            System.out.println("TBD");
        }
    }
}
