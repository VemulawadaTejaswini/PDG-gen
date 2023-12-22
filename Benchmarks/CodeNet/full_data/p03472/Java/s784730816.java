import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner scanner = new Scanner(System.in);
        final int N = scanner.nextInt();
        final int H = scanner.nextInt();
        final Integer[] A = new Integer[N];
        final Integer[] B = new Integer[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
            B[i] = scanner.nextInt();
        }
        final int max_a = Collections.max(Arrays.asList(A));
        Arrays.sort(B, Comparator.reverseOrder());
        int h = H;
        int n = 0;
        for (int i = 0; i < N && B[i] >= max_a && h > 0; i++) {
            final int b = B[i];
            h -= b;
            n++;
        }
        n += Math.max(0, h + max_a - 1) / max_a;
        System.out.println(n);
    }
}