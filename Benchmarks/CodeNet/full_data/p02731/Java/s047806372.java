import java.math.BigDecimal;
import java.util.*;
import static java.lang.System.out;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        BigDecimal decimalL = new BigDecimal(l);
        BigDecimal height = decimalL.divide(new BigDecimal(3),2, BigDecimal.ROUND_HALF_UP);
        BigDecimal ans = height.multiply(height).multiply(height);
        System.out.println(ans);
    }

}
