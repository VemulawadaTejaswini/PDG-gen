

import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        long[] a = new long[n], b = new long[n], c = new long[m], d = new long[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            b[i] = sc.nextLong();
        }

        for (int i = 0; i < m; i++) {
            c[i] = sc.nextLong();
            d[i] = sc.nextLong();
        }

        for (int i = 0; i < n; i++) {
            int ans = -1;
            long dist = 1L << 28;
            for (int j = 0; j < m; j++) {
                if (ans < 0 || abs(a[i] - c[j]) + abs(b[i] - d[j]) < dist) {
                    dist = abs(a[i] - c[j]) + abs(b[i] - d[j]);
                    ans = j;
                }
            }
            System.out.println(ans + 1);
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
