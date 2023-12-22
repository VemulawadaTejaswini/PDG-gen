import java.math.BigDecimal;
import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int M = sc.nextInt();

        long ans = 0;

        if (N == M) {
            // 2 * M! * M!
            long factM = fact(M);
            ans = 2 * factM * factM;
        } else if (N + 1 == M || N == M + 1) {
            // M! * N!
            ans = fact(M) * fact(N);
        }
        System.out.println(ans % 1000000007l);
    }

    private static long fact(long n) {
        long ans = 1;
        for (long i = 1; i <= n; i++) {
            ans *= i;
            ans = ans % 1000000007l;
        }
        return ans;
    }
}