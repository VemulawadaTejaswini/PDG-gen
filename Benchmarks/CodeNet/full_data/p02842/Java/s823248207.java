import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int ans = 0;
        BigDecimal tax = BigDecimal.valueOf(1.08);
        for (int i = 1; i < n; i++) {
            BigDecimal ibd = BigDecimal.valueOf(i);
            BigDecimal multiply = ibd.multiply(tax);
            int calc = multiply.setScale(0, RoundingMode.DOWN).toBigInteger().intValue();
            if (calc == n) {
                ans = i;
            }
        }

        if (ans == 0) {
            System.out.println(":(");
        } else {
            System.out.println(ans);
        }
    }
}
