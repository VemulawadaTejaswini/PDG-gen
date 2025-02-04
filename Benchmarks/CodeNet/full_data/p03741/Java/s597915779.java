import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final void main(String args[]) throws Exception {
        new Main().solve();
    }

    void solve() {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; ++i) {
                a[i] = in.nextInt();
            }
            long sum1 = 0, x = 0;
            long sum2 = 0, y = 0;
            for (int i = 0; i < n; ++i) {
                x += a[i];
                y += a[i];
                if (i % 2 == 0) {
                    if (x <= 0) {
                        sum1 += 1 - x;
                        x = 1;
                    }
                    if (y >= 0) {
                        sum2 += 1 + y;
                        y = -1;
                    }
                } else {
                    if (x >= 0) {
                        sum1 += 1 + x;
                        x = -1;
                    }
                    if (y <= 0) {
                        sum2 += 1 - y;
                        y = 1;
                    }

                }
            }
            System.out.println(Math.min(sum1, sum2));
        }
    }

    void tr(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }
}