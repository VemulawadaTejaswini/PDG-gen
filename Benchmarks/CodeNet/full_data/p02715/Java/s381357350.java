import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int K = scan.nextInt();
        long[] s = new long[K + 1];
        long mod = 1000000007;
        for (int i = K; 0 < i; i--) {
            s[i] = pow(K/i, N, mod);
            for (int j = 2; i * j <= K; j++) {
                s[i] -= s[i*j];
            }
        }
        long ans = 0;
        for (int i = 1; i <= K; i++) {
            long t = i * s[i];
            t %= mod;
            ans += t;
            ans %= mod;
        }
        System.out.println(ans);
    }
    private long pow(long base, long d, long mod) {
        if (d == 0) {
            return 1;
        }
        if (d % 2 == 1) {
            long t = base * pow(base, d - 1, mod);
            t %= mod;
            return t;
        }
        long t = pow(base, d / 2, mod);
        t *= t;
        t %= mod;
        return t;
    }
}
