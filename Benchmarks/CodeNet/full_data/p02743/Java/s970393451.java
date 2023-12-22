import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long c = Long.parseLong(sc.next());
        double aa = Math.sqrt((double)a);
        double bb = Math.sqrt((double)b);
        double cc = Math.sqrt((double)c);
        BigDecimal aa1 = new BigDecimal(aa);
        BigDecimal bb1 = new BigDecimal(bb);
        BigDecimal cc1 = new BigDecimal(cc);
        aa1 = aa1.add(bb1);
        if (aa1.compareTo(cc1) == -1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}