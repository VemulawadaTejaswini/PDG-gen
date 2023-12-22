import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        sc.close();
        int MOD = 1_000_000_007;
        if (Math.abs(n - m) > 1) {
            System.out.println(0);
        } else if (n == m) {
            System.out.println((((nPk(n, n, MOD) * nPk(m, m, MOD)) % MOD) * 2) % MOD);
        } else {
            System.out.println((nPk(n, n, MOD) * nPk(m, m, MOD)) % MOD);
        }
    }

    static long nPk(int n, int k, int MOD) {
        long r = 1;
        while (k > 0) {
            r *= n;
            r %= MOD;
            n -= 1;
            k -= 1;
        }
        return r;
    }
}