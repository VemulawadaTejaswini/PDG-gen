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
        A solver = new A();
        solver.solve(1, in, out);
        out.close();
    }

    static class A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 整数の入力
            int h = Integer.parseInt(in.next());
            int w = Integer.parseInt(in.next());
            int n = Integer.parseInt(in.next());
            int ans = 0;
            int n2 = 0;

            if (h > w) {
                while (true) {
                    n2 += h;
                    ans++;
                    if (n2 >= n) {
                        break;
                    }
                }
            } else {
                while (true) {
                    n2 += w;
                    ans++;
                    if (n2 >= n) break;
                }
            }

            // 出力
            out.println(ans);

        }

    }
}

