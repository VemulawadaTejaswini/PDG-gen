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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int N = Integer.parseInt(in.next());
            int T = Integer.parseInt(in.next());
            int ct[][] = new int[N][2];
            for (int i = 0; i < N; i++) {
                ct[i][0] = Integer.parseInt(in.next());
                ct[i][1] = Integer.parseInt(in.next());
            }
            int ans = Integer.MAX_VALUE;
            int tle = 0;

            for (int i = 0; i < N; i++) {
                if (ct[i][1] <= T) {
                    ans = Math.min(ans, ct[i][0]);
                } else {
                    tle++;
                }
            }

            // 出力
            out.println(tle == N ? "TLE" : ans);

        }

    }
}

