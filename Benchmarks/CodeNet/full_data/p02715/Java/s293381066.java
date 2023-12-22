
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long mod = 1000000007L;
        long sum = 0;
        long[] times = new long[k + 1];
        for (int gcd = k; gcd >= 1; --gcd) {
            long currentTimes = pow(k/gcd, n, mod);
            for (int i = 2 * gcd; i <= k; i += gcd) {
                currentTimes = (currentTimes - times[i] + mod) % mod;
            }
            times[gcd] = currentTimes;
            sum += gcd * currentTimes % mod;
            sum %= mod;
        }
        System.out.println(sum);

    }

    public static long pow(long base, long exp, long mod) {
        if (exp == 0) {
            return 1;
        }
        long half = pow(base, exp / 2, mod);
        if (exp % 2 == 0) {
            return half * half % mod;
        } else {
            return ((half * half % mod) * base % mod) % mod;
        }
    }
}
