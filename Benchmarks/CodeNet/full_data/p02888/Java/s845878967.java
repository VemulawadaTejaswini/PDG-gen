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

            Arrays.sort(L);
            // O(N^3)
            for (int a = 0; a < n - 2; a++) {
                for (int b = a + 1; b < n - 1; b++) {
                    for (int c = b + 1; c < n; c++) {
                        if (L[a] < L[b] + L[c] && L[b] < L[c] + L[a] && L[c] < L[a] + L[b]) ans++;
                        else break;
                    }
                }
            }


            // 出力
            out.println(ans);

        }

    }
}

