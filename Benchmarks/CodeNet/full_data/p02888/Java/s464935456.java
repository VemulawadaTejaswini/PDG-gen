import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DTriangles solver = new DTriangles();
        solver.solve(1, in, out);
        out.close();
    }

    static class DTriangles {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            long[] L = new long[n];
            for (int i = 0; i < n; i++) {
                L[i] = Integer.parseInt(in.next());
            }
            long ans = 0;

            // O(N^2logN)
            Arrays.sort(L);
            for (int a = 0; a < n; a++) {
                for (int b = a + 1; b < n; b++) {
                    long tmp = lowerBound(n, L, L[a] + L[b]);
                    ans += Math.max(tmp - (b + 1), 0);
                }
            }

            // 出力
            out.println(ans);

        }

        private static long lowerBound(int end, long[] arr, long key) {
            int left = 0;
            int right = end;
            while (left < right) {
                int mid = (left + right) / 2;
                if (arr[mid] < key) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            return left;
        }

    }
}

