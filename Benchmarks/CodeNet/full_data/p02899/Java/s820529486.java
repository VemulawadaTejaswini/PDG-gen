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
            Integer a[][] = new Integer[n][2];
            for (int i = 0; i < n; i++) {
                a[i][0] = i + 1;
                a[i][1] = Integer.parseInt(in.next());
            }
            Arrays.sort(a, (x, y) -> Integer.compare(x[1], y[1]));

            // 出力
            for (int i = 0; i < n; i++) {
                out.print(a[i][0]);
                if (i < n - 1) out.print(" ");
            }
            out.println();

        }

    }
}

