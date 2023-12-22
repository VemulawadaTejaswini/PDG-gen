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
        A solver = new A();
        solver.solve(1, in, out);
        out.close();
    }

    static class A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(in.next());
            }
            int ans = 0;
            int ptr = 0;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] == a[i + 1] || (i > 0 && a[i] == a[i - 1] && a[i] != a[i + 1])) ptr++;
                if (ptr != 0 && ptr % 2 == 0) ans++;
                if (a[i] != a[i + 1]) ptr = 0;
            }

            // 出力
            out.println(ans);

        }

    }
}

