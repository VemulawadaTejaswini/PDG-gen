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
            int[] cnt = new int[4];
            for (int i = 0; i < 3; i++) {
                int from = Integer.parseInt(in.next());
                int to = Integer.parseInt(in.next());
                cnt[from - 1]++;
                cnt[to - 1]++;
            }
            boolean ok = true;
            for (int i = 0; i < 4; i++) {
                if (cnt[i] >= 3) ok = false;
            }

            // 出力
            out.println(ok ? "YES" : "NO");

        }

    }
}

