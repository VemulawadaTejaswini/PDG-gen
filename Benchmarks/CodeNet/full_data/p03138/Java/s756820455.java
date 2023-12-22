import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] counts = new int[40]; // max 40 digits
        long[] as = new long[n];
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            as[i] = a;
            int j = 0;
            while (a >= 1) {
                counts[j] += a % 2l;
                a /= 2l;
                j++;
            }
        }

        long x = 0l;
        long pow = 1l;
        for (int i = 0; i < 40; i++) {
            if (i != 0) {
                pow *= 2l;
            }
            if (2 * (n - counts[i]) > n) {
                if (x + pow > k) {
                    break;
                }
                x += pow;
            }
        }

        long ans = 0l;
        for (int i = 0; i < n; i++) {
            ans += x ^ as[i];
        }
        System.out.println(ans);
    }
}
