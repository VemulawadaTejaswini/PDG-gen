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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            Integer v[] = new Integer[n];
            for (int i = 0; i < n; i++) {
                v[i] = Integer.parseInt(in.next());
            }

            Arrays.sort(v);
            double ans = v[0];

            for (int i = 1; i < n; i++) {
                ans = (ans + v[i]) / 2.0;
            }

            // 出力
            out.println(ans);

        }

    }
}

