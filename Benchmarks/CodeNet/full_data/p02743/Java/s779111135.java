import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        BigDecimal a = new BigDecimal(sc.next()).sqrt(MathContext.DECIMAL128);
        BigDecimal b = new BigDecimal(sc.next()).sqrt(MathContext.DECIMAL128);
        a = a.add(b);
        BigDecimal c = new BigDecimal(sc.next()).sqrt(MathContext.DECIMAL128);
        System.out.println(a.compareTo(c) >= 1  ? "No" : "Yes");
    }
}