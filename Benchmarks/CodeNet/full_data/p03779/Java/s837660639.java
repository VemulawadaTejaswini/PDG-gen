import java.math.BigDecimal;
import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long X = sc.nextLong();
        long sum = 0;

        for (long i = 1;; i++) {
            sum += i;
            if (sum >= X) {
                System.out.println(i);
                return;
            }
        }
    }
}