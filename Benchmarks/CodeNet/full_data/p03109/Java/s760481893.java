import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date a = sdf.parse("2019/04/30");
        Date d = sdf.parse(s);

        if(a.compareTo(d) >= 0)System.out.println("Heisei");
        else System.out.println("TBD");
        sc.close();
    }

}
