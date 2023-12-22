import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        sc.nextLine();
        String S = sc.nextLine();
        String T = sc.nextLine();

        if (S.charAt(0) != T.charAt(0)) {
            System.out.println(-1);
            return;
        }

        long G = lcm(N, M);
        long n = G / N;
        long m = G / M;

        while ((n - G/N <= M - 1) && (m - G/M)<= N - 1) {
            if (S.charAt((int)(m - G/M)) == T.charAt((int)(n - G/N))) {
                n = n + G/N;
                m = m + G/M;
            } else {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(G);
    }

    private static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }

    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
}