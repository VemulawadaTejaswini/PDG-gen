import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }

            HashSet<Integer> used = new HashSet<>();
            int max = 1;
            for (int i = 0; i < N; i++) {
                ArrayList<Integer> divisor = divisor(A[i]);
                for (Integer div : divisor) {
                    int d = div.intValue();
                    if (!used.add(d)) {
                        continue;
                    }
                    int count = 0;
                    for (int j = 0; j < N; j++) {
                        if (A[j] % d != 0) {
                            count++;
                            if (count >= 2) {
                                break;
                            }
                        }
                    }
                    if (count >= 2) {
                        continue;
                    }
                    max = Math.max(max, d);

                }

            }

            System.out.println(max);
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
