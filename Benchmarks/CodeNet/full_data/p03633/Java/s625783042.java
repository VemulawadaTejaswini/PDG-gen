import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long t[] = new long[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextLong();
        }
        Arrays.sort(t);
        long lcm = lcm(t[0], t[1]);
        for (int i = 2; i < n; i++) {
            lcm = lcm(lcm, t[i]);
        }
        System.out.println(lcm);
    }
    static long lcm(long m, long n) {
        return m / gcd(m, n) * n;
    }
    static long gcd(long m, long n) {
        if (m < n) {
            return gcd(n, m);
        }
        if (n == 0) {
            return m;
        }
        return gcd(n, m % n);
    }
}
