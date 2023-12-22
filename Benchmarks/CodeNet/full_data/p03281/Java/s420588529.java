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
            int ans = 0;
            while (n > 0) {
                if (n % 2 != 0) {
                    if (n % 3 == 0 && n % 5 == 0 && n % 7 == 0) ans++;
                    if (n % 3 == 0 && n % 5 == 0 && n % 11 == 0) ans++;
                    if (n % 3 == 0 && n % 5 == 0 && n % 13 == 0) ans++;
                    if (n % 27 == 0 && n % 5 == 0) ans++;
                    if (n % 27 == 0 && n % 7 == 0) ans++;
                }
                n--;
            }

            // 出力
            out.println(ans);

        }

    }
}

