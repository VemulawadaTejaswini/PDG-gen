import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.Scanner;
public class Main {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        BigDecimal n = new BigDecimal(sc.next());
        BigDecimal m = new BigDecimal(sc.next());
        BigDecimal d = new BigDecimal(sc.next());
        
        BigDecimal s = n.add(d.multiply(new BigDecimal("-1"))).multiply(new BigDecimal(2));
        so.println( s.multiply(m.add((new BigDecimal("-1"))).divide(n).divide(n)));
    }
}