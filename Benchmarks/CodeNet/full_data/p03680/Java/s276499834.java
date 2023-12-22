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
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(in.next());
            }
            int ans = 0;

            boolean ok = false;
            int index = 0;
            for (int i = 0; i < n; i++) {
                if (a[index] == 2) {
                    ans++;
                    ok = true;
                    break;
                }
                ans++;
                index = a[index] - 1;
            }

            // 出力
            if (ans != 0 && ok) {
                out.println(ans);
            } else {
                out.println(-1);
            }

        }

    }
}

