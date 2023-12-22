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
            int H = Integer.parseInt(in.next());
            int W = Integer.parseInt(in.next());
            int ans = 0;

            String a[] = new String[H];
            for (int i = 0; i < H; i++) {
                a[i] = in.next();
            }

            boolean r[] = new boolean[H];
            boolean c[] = new boolean[W];

            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (a[i].charAt(j) == '#') {
                        r[i] = true;
                        c[j] = true;
                    }
                }
            }

            for (int i = 0; i < H; i++) {
                if (r[i]) {
                    for (int j = 0; j < W; j++) {
                        if (c[j]) {
                            out.print(a[i].charAt(j));
                        }
                    }
                    out.println();
                }
            }
        }

    }
}

