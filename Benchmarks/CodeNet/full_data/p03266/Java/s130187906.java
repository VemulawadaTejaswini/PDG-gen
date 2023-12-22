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
        TriangularRelationship solver = new TriangularRelationship();
        solver.solve(1, in, out);
        out.close();
    }

    static class TriangularRelationship {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();

            int[] num = new int[k];
            for (int i = 1; i <= n; i++) {
                num[i % k]++;
            }

            long result = 0;
            for (int a = 0; a < k; a++) {
                int b = (k - a) % k;
                int c = (k - a) % k;
                if ((b + c) % k != 0) {
                    continue;
                }
                result += (num[a] * num[b] * num[c]);
            }
            out.print(result);

        }

    }
}

