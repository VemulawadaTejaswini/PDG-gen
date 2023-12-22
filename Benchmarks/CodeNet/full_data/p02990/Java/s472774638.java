
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = in.nextInt();
        final int k = in.nextInt();
        for (int i = 1; i <= k; ++i) {
            System.out.println((c(k - 1, i - 1) * c(n - k + 1, i)) % MOD);
        }
    }

    public static long A(int n, int m) {
        long result = 1;
        for (int i = m; i > 0; i--) {
            result *= n;
            n--;
            result %= MOD;
        }
        return result;
    }

    private static long c(int n, int k) {        
        return A(n, k) * BigInteger.valueOf(A(k, k)).modInverse(BigInteger.valueOf(MOD)).longValue() % MOD;
    }
}