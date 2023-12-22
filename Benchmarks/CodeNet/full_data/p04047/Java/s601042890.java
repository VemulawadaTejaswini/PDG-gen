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
        A solver = new A();
        solver.solve(1, in, out);
        out.close();
    }

    static class A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int[] l = new int[2 * n];
            for (int i = 0; i < 2 * n; i++) {
                l[i] = Integer.parseInt(in.next());
            }
            int ans = 0;

            Arrays.sort(l);

            for (int i = 2; i <= 2 * n; i = i + 2) {
                ans += Math.min(l[i - 2], l[i - 1]);
            }

            // 出力
            out.println(ans);

        }

    }
}

