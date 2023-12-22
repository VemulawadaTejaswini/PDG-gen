import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long N = scan.nextLong();
        long a = scan.nextLong();
        long b = scan.nextLong();
        long mod = 1000000007;
        long ans = pow(2, N, mod);
        ans = (ans + mod - 1) % mod;
        long x = COM(N, a, mod);
        long y = COM(N, b, mod);
        ans = (ans + mod - x) % mod;
        ans = (ans + mod - y) % mod;
        System.out.println(ans);
    }

    private long COM(long N, long a, long mod) {
        long Y = 1;
        long X = 1;
        for (long i = N - a + 1; i <= N; i++) {
            X *= i;
            X %= mod;
            Y *= (N - i + 1);
            Y %= mod;
        }
        long Y_1 = pow(Y, mod-2, mod);
        long com = X * Y_1;
        com %= mod;
        return com;
    }

    private long pow(long base, long y, long mod) {
        if (y == 0) {
            return 1;
        }
        if (y % 2 == 1) {
            long z = base * pow(base, y - 1, mod);
            z %= mod;
            return z;
        }
        long z = pow(base,  y / 2, mod);
        z = z * z;
        z %= mod;
        return z;
    }

}
