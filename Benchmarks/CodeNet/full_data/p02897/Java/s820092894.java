import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] c) {
        Scanner scan = new Scanner(System.in);
        double t = scan.nextInt();
        double half = 2;
        double s = t % half;
        if (s == 0) {
            System.out.println(new BigDecimal((t / half) / t).setScale(6));
        } else {
            double v = Math.ceil(t / half);
            System.out.println(new BigDecimal(v / t).setScale(6, BigDecimal.ROUND_HALF_UP));
        }
    }
}