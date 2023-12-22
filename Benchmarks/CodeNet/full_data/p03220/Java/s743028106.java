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
                double tmp = avgteemp(t, h[i]);
                tmp = Math.abs((tmp - (double) a));
                if (tmp < 0) tmp = -tmp;
                double tmp2 = kouho;
                kouho = Math.min(tmp, kouho);
                if (tmp2 != kouho) ans = i;
            }
            // 出力
            out.println(++ans);

        }

        public static double avgteemp(int standardtemp, int x) {
            double avgtemp = standardtemp - x - 0.006;
            return avgtemp;
        }

    }
}

