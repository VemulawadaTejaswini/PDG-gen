import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static final void main(String args[]) throws Exception {
        new Main().solve();
    }

    void solve() {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            long a[] = new long[n * 3];
            for (int i = 0; i < n * 3; ++i) {
                a[i] = in.nextLong();
            }
            Arrays.sort(a);
            long x = 0;
            for (int i = 0; i < n; ++i) {
                x += a[n * 3 - 2 - (2 * i)];
            }
            System.out.println(x);
        }
    }

    void tr(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }
}