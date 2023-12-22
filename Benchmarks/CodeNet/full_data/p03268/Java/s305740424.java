import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CTriangularRelationship solver = new CTriangularRelationship();
        solver.solve(1, in, out);
        out.close();
    }

    static class CTriangularRelationship {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt(), k = in.nextInt();
            long ans = 0;
            int p = n / k;
            ans += p * p * p;
            if (k % 2 == 0) {
                int l = k / 2;
                long c = 0;
                for (int i = 1; i <= n; i++) {
                    if (i % k == l) {
                        c++;
                    }
                }
                ans += c * c * c;
            }
            out.println(ans);

        }

    }
}

