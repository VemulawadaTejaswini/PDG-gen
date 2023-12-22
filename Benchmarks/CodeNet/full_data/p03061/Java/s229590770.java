import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }

            Arrays.sort(A);

            int gcd0 = A[0];
            for (int i = 0; i < N; i++) {
                if (i == 1) {
                    continue;
                }
                gcd0 = gcd(gcd0, A[i]);
            }
            int gcd1 = A[1];
            for (int i = 0; i < N; i++) {
                if (i == 2) {
                    continue;
                }
                gcd1 = gcd(gcd1, A[i]);
            }
            int gcd2 = 0;
            if (N >= 2) {
                gcd2 = A[2];
                for (int i = 0; i < N; i++) {
                    if (i == 0) {
                        continue;
                    }
                    gcd2 = gcd(gcd2, A[i]);
                }
            }
            System.out.println(Math.max(gcd0, Math.max(gcd1, gcd2)));
        }
    }

    public static final int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static final ArrayList<Integer> divisor(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                res.add(i);
                if (n / i != i) {
                    res.add(n / i);
                }
            }
        }
        return res;
    }
}
