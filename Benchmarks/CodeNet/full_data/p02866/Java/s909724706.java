import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] d = new int[N];
        for (int i = 0; i < N; i++) {
            d[i] = scan.nextInt();
        }
        if (d[0] != 0) {
            System.out.println(0);
            return;
        }
        if (N == 1) {
            System.out.println(1);
            return;
        }
        int max = Arrays.stream(d).max().getAsInt();
        long[] x = new long[N];
        for (int i = 1; i < N; i++) {
            x[d[i]] += 1;
        }
        if (0 < x[0]) {
            System.out.println(0);
            return;
        }
        long MOD = 998244353;
        long answer = 1;
        if (x[1] == 0) {
            System.out.println(0);
            return;
        }
        for (int i = 2; i <= max; i++) {
            if (x[i] == 0) {
                answer = 0;
                break;
            }
            answer *= pow(x[i-1], x[i], MOD);
            answer %= MOD;
        }
        System.out.println(answer);
    }
    private long pow(long x, long y, long MOD) {
        if (y == 0) {
            return 1;
        }
        if (y == 1) {
            return x;
        }
        if (y % 2 == 1) {
            long z = x * pow(x, y - 1, MOD);
            z %= MOD;
            return z;
        }
        long z = pow(x, y / 2, MOD);
        z %= MOD;
        z = z * z;
        z %= MOD;
        return z;
    }
}
