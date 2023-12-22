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
            int A = Integer.parseInt(in.next());
            int B = Integer.parseInt(in.next());
            int M = Integer.parseInt(in.next());
            int a[] = new int[A];
            int b[] = new int[B];
            for (int i = 0; i < A; i++) {
                a[i] = Integer.parseInt(in.next());
            }
            for (int i = 0; i < B; i++) {
                b[i] = Integer.parseInt(in.next());
            }
            Arrays.sort(a);
            Arrays.sort(b);
            int ans = a[0] + b[0];

            for (int i = 0; i < M; i++) {
                int x = Integer.parseInt(in.next());
                int y = Integer.parseInt(in.next());
                int c = Integer.parseInt(in.next());
                x--;
                y--;
                ans = Math.min(ans, a[x] + b[y] - c);
            }
            // 出力
            out.println(ans);

        }

    }
}

