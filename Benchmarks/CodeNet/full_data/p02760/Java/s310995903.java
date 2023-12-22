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
            int a[][] = new int[3][3];
            int c[][] = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    a[i][j] = Integer.parseInt(in.next());
                }
            }
            int n = Integer.parseInt(in.next());
            int b[] = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = Integer.parseInt(in.next());
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < n; k++) {
                        if (a[i][j] == b[k]) {
                            c[i][j] = 1;
                            continue;
                        }
                    }
                }
            }

            for (int i = 0; i < 3; i++) {
                if (c[i][0] + c[i][1] + c[i][2] == 3) {
                    out.println("Yes");
                    return;
                }
            }
            for (int i = 0; i < 3; i++) {
                if (c[0][i] + c[1][i] + c[2][i] == 3) {
                    out.println("Yes");
                    return;
                }
            }
            if (c[0][0] + c[1][1] + c[2][2] == 3) {
                out.println("Yes");
                return;
            }
            if (c[2][0] + c[1][1] + c[0][2] == 3) {
                out.println("Yes");
                return;
            }
            out.println("No");
        }

    }
}

