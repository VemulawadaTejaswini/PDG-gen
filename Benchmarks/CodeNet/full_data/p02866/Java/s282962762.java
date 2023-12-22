
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    long MOD = 998244353;
    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ds = new int[n];
        for (int i = 0; i < n; i++) ds[sc.nextInt()]++;
        if (ds[0] != 1) {
            System.out.println(0);
            return;
        }
        for (int i = 1; i < n - 1; i++) {
            if (ds[i] == 0 && ds[i + 1] > 0) {
                System.out.println(0);
                return;
            }
        }
        long cnt = 1;
        int preb = ds[1];

        for (int i = 1; i < n - 1; i++) {
            if (ds[i] == 0) break;
            cnt = (cnt * pow(ds[i - 1], ds[i])) % MOD;
        }
        System.out.println(cnt);
    }

    long pow(long a, long p) {
        long x = 1;
        while (p > 0) {
            if ((p & 1) == 1) x = x * a % MOD;
            a = a * a % MOD;
            p >>= 1;
        }
        return x;
    }

    void debug(Object...os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }

}
