import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        long m = sc.nextLong();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            if (a[i] % 2 == 1) {
                System.out.println(0);
                return;
            } else {
                a[i] /= 2;
            }
        }
        long lcm = lcm(a);
        if (lcm == 0) System.out.println(0);
        else System.out.println((m / lcm + 1) / 2);
    }

    private static long lcm(long[] a) {
        long res = 1;
        for (long num : a) {
            res = res * num / gcd(res, num);
        }
        return res;
    }

    private static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}