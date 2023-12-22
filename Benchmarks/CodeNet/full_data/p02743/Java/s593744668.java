import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(solve() ? "Yes" : "No");
    }

    private static boolean solve() {

        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        BigDecimal A = BigDecimal.valueOf(a);
        BigDecimal B = BigDecimal.valueOf(b);
        BigDecimal C = BigDecimal.valueOf(c);
        BigDecimal right = C.subtract(A).subtract(B);

        if (c - a - b <= 0) {
            return false;
        }

        right = right.multiply(right);
        BigDecimal left = BigDecimal.valueOf(4).multiply(A).multiply(B);
        if (left.compareTo(right) < 0) {
            return true;
        }
        return false;
    }
}
