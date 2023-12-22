import java.util.*;

public class Main {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static long[] fac = new long[200_001];
    static long[] inv = new long[200_001];
    static long[] ifac = new long[200_001];

    static void makeTable() {
        fac[0] = fac[1] = 1;
        ifac[0] = ifac[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < 200_001; i++) {
            fac[i] = (fac[i - 1] * i) % MOD;
            inv[i] = ((-inv[MOD % i] + MOD) * (MOD / i)) % MOD;
            ifac[i] = (ifac[i - 1] * inv[i]) % MOD;
        }
    }

    // int N = scanner.nextInt();
    // scanner.nextLine();
    // int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    static void solve(Scanner scanner) {
        makeTable();
        int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int H = n[0], W = n[1], A = n[2], B = n[3];
        long ans = 0;
        for (int b = B + 1; b <= W; b++) {
            long up = fac[H - A + b - 2];
            up = (up * ifac[H - A - 1]) % MOD;
            up = (up * ifac[b - 1]) % MOD;
            long down = fac[A + W - b - 1];
            down = (down * ifac[A - 1]) % MOD;
            down = (down * ifac[W - b]) % MOD;
            ans = (ans + ((up * down) % MOD)) % MOD;
        }

        System.out.println(ans);
    }

}
