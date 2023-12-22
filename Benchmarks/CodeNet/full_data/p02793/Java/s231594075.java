import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n;i++) {
            a[i] = in.nextInt();
        }
        long b = 1;
        for(int i = 0;i < n;i++) {
            b = lcm(a[i], b);
        }
        long ans = 0, mod = (long)1e9 + 7;
        for(int i = 0;i < n;i++) {
            ans = (ans + b / a[i]) % mod;
        }
        System.out.println(ans);
    }

    private static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    private static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
