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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            boolean ok = true;
            Integer[][] AB = new Integer[n][2];
            for (int i = 0; i < n; i++) {
                AB[i][0] = Integer.parseInt(in.next());
                AB[i][1] = Integer.parseInt(in.next());
            }
            Arrays.sort(AB, (x, y) -> {
                if (x[1] != y[1]) return (x[1] - y[1]);
                return (x[0] - y[0]);
            });
            long tot = 0;
            for (int i = 0; i < n; i++) {
                tot += AB[i][0];
                if (tot > AB[i][1]) ok = false;
            }

            out.println(ok ? "Yes" : "No");

        }

    }
}

