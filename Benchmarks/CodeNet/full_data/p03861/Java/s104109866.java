import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        BigDecimal bd1 = BigDecimal.valueOf(b / x).setScale(0, BigDecimal.ROUND_FLOOR);
        BigDecimal bd2 = BigDecimal.valueOf((a - 1) / x).setScale(0, BigDecimal.ROUND_FLOOR);

        if(bd1.subtract(bd2).longValue() < 0) {
            System.out.println(0);
        } else {
            System.out.println(bd1.subtract(bd2));
        }
    }
}