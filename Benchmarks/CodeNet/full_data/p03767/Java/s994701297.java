import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

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
            Integer[] a = new Integer[3 * n];
            for (int i = 0; i < 3 * n; i++) {
                a[i] = Integer.parseInt(in.next());
            }
            long ans = 0;

            Arrays.sort(a, Comparator.reverseOrder());

            int pos = 1;
            for (int i = 0; i < n; i++) {
                ans += a[pos];
                pos += 2;
            }

            // 出力
            out.println(ans);

        }

    }
}

