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
            String S = in.next();
            int n = S.length();
            long ans = 0;
            long[] a = new long[n + 1];
            for (int i = 0; i < n; i++) {
                if (S.charAt(i) == '<') {
                    a[i + 1] = a[i] + 1;
                }
            }
            for (int i = n - 1; i >= 0; i--) {
                if (S.charAt(i) == '>') {
                    if (a[i + 1] >= a[i]) {
                        a[i] = a[i + 1] + 1;
                    }
                }
            }

            // 出力
            for (long num : a) {
                ans += num;
            }
            out.println(ans);

        }

    }
}

