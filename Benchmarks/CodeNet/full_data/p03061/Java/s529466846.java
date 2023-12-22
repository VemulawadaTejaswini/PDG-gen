

import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {

        int max = 0;
        try (final Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                if (i >= 1) {
                    int gcd = gcd(A[i - 1], A[i]);
                    max = Math.max(gcd, max);
                }
                if (i >= 2) {
                    int gcd = gcd(A[i - 2], A[i]);
                    max = Math.max(gcd, max);
                }
            }
        }
        System.out.println(max);
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
