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
            int n = Integer.parseInt(in.next());
            int m = Integer.parseInt(in.next());
            int k[] = new int[n];
            int dishes[] = new int[m];
            for (int i = 0; i < n; i++) {
                k[i] = Integer.parseInt(in.next());
                for (int j = 0; j < k[i]; j++) {
                    dishes[Integer.parseInt(in.next()) - 1]++;
                }
            }
            int ans = 0;
            for (int i = 0; i < m; i++) {
                if (dishes[i] == n) ans++;
            }

            // 出力
            out.println(ans);

        }

    }
}

