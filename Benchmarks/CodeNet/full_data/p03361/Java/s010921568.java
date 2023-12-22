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
            char[][] s = new char[55][55];
            for (int i = 1; i <= h; i++) {
                String tmp = in.next();
                for (int j = 1; j <= w; j++) {
                    s[i][0] = '.';
                    s[i][j] = tmp.charAt(j - 1);
                    s[i][w + 1] = '.';
                }
            }
            int ans = 0;
            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= w; j++) {
                    if (s[i][j] == '#') {
                        if (s[i][j - 1] != '#' && s[i][j + 1] != '#' && s[i - 1][j] != '#' && s[i + 1][j] != '#') {
                            ans++;
                            break;
                        }
                    }
                }
            }

            // 出力
            if (ans == 0) {
                out.println("Yes");
                return;
            }
            out.println("No");

        }

    }
}

