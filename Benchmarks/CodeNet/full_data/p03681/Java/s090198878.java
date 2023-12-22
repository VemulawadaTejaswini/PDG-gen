import java.util.Scanner;

public class Main {

    private static final long MOD = 1_000_000_007;

    private static long factorial(long n) {
        long ans = 1;
        for (long i = 2; i <= n; i++) {
            ans *= i;
            ans %= MOD;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (Math.abs(n - m) > 1) {
            System.out.println(0);
            return;
        }
        long ans = factorial(n) * factorial(m) % MOD;
        if (n == m) {
            ans *= 2;
            ans %= MOD;
        }
        System.out.println(ans);
    }

}
