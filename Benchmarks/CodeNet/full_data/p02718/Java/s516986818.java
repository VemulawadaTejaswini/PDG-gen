import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

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
            Integer a[] = new Integer[n];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(in.next());
                sum += a[i];
            }
            double avg = (sum / (4 * m));
            long ans = 0;
            Arrays.sort(a, Collections.reverseOrder());

            for (int i = 0; i < n; i++) {
                if (a[i] >= avg) ans++;
            }

            // 出力
            if (ans >= m) {
                out.println("Yes");
            } else {
                out.println("No");
            }

        }

    }
}

