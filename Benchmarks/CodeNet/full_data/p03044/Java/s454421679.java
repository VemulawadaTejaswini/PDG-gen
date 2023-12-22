import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        EvenRelation solver = new EvenRelation();
        solver.solve(1, in, out);
        out.close();
    }

    static class EvenRelation {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long[][] route = new long[n + 1][n + 1];

            for (int i = 1; i < n; i++) {
                int u = in.nextInt();
                int v = in.nextInt();
                long w = in.nextLong();
                route[u][v] = w;
            }
            boolean[] result = new boolean[n + 1];

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (route[i][j] % 2 == 1) {
                        result[j] = !result[j];
                    }
                }
            }

            for (int i = 1; i <= n; i++) {
                if (result[i]) {
                    out.println(1);
                } else {
                    out.println(0);
                }
            }
        }

    }
}

