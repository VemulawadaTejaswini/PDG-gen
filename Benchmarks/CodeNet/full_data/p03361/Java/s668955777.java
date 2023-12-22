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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int h = Integer.parseInt(in.next());
            int w = Integer.parseInt(in.next());
            char[][] s = new char[h][w];
            for (int i = 0; i < h; i++) {
                s[i] = in.next().toCharArray();
            }
            boolean ans = true;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (s[i][j] == '#') {
                        if (s[Math.min(i + 1, h - 1)][j] == '.' && s[i][Math.min(j + 1, w - 1)] == '.' && s[Math.max(i - 1, 0)][j] == '.' && s[i][Math.max(j - 1, 0)] == '.') {
                            ans = false;
                            break;
                        }
                    }
                }
            }

            // 出力
            if (ans) {
                out.println("Yes");
                return;
            }
            out.println("No");

        }

    }
}

