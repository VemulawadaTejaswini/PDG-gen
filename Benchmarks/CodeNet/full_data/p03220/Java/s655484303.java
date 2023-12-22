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
            int t = Integer.parseInt(in.next());
            int a = Integer.parseInt(in.next());
            int h[] = new int[n];
            for (int i = 0; i < n; i++) {
                h[i] = Integer.parseInt(in.next());
            }
            int ans = 0;
            double kouho = Double.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                double avg = t - h[i] * 0.006;
                if (kouho > Math.abs(a - avg)) {
                    kouho = Math.abs(a - avg);
                    ans = i;
                }
            }
            // 出力
            out.println(++ans);

        }

    }
}

