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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int N = Integer.parseInt(in.next());
            int X = Integer.parseInt(in.next());
            int m[] = new int[N];
            for (int i = 0; i < N; i++) {
                m[i] = Integer.parseInt(in.next());
            }
            int ans = 0;

            int sum = 0;
            for (int i = 0; i < N; i++) {
                sum += m[i];
            }

            Arrays.sort(m);

            ans = N + (X - sum) / m[0];

            // 出力
            out.println(ans);

        }

    }
}

