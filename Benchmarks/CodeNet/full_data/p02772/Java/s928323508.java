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
            Integer a[][] = new Integer[n][2];
            for (int i = 0; i < n; i++) {
                a[i][0] = Integer.parseInt(in.next());
            }
            long cnt = 0;
            long sum = 0;

            for (int i = 0; i < n; i++) {
                if (a[i][0] % 2 == 0) {
                    cnt++;
                    if (a[i][0] % 3 == 0 || a[i][0] % 5 == 0) {
                        sum++;
                    }
                }
            }
            // 出力
            if (cnt == sum) {
                out.println("APPROVED");
            } else {
                out.println("DENIED");
            }

        }

    }
}

