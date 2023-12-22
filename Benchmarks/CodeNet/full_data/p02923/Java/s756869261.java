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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int h[] = new int[n];
            int s[] = new int[n];
            for (int i = 0; i < n; i++) {
                h[i] = Integer.parseInt(in.next());
            }
            for (int i = 0; i < n - 1; i++) {
                s[i] = h[i] - h[i + 1];
            }
            int ans = 0;
            int tmp = 0;
            for (int i = 0; i < n - 1; i++) {
                if (s[i] >= 0) tmp++;
                else tmp = 0;
                ans = Math.max(ans, tmp);
            }

            // 出力
            out.println(ans);

        }

    }
}

