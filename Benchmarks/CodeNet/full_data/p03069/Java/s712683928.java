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
            int N = in.nextInt();
            String S = in.next();
            char[] cs = S.toCharArray();

            int ans = 0;
            int c1 = 0;
            int c2 = 0;
            int f = 0;
            for (int i = 0; i < N; i++) {
                if (f == 0 && cs[i] == '#') {
                    f = 1;
                    c1++;
                } else if (f == 1) {
                    if (cs[i] == '#') {
                        c1++;
                    } else {
                        f = 2;
                        c2++;
                    }
                } else if (f == 2) {
                    if (cs[i] == '#') {
                        if (c1 <= c2) {
                            ans += c1;
                            c1 = 0;
                            c2 = 0;
                        } else {
                            ans += c2;
                            c2 = 0;
                        }
                        f = 1;
                        c1++;
                    } else {
                        c2++;
                    }
                }
            }
            if (c1 <= c2) {
                ans += c1;
            } else {
                ans += c2;
            }
            out.println(ans);
        }

    }
}

