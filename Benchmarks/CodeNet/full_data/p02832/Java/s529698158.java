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
        ABC148_d solver = new ABC148_d();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC148_d {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int a[] = new int[N + 1];

            for (int i = 1; i <= N; i++) {
                a[i] = in.nextInt();
            }
            int broke = 0;
            boolean isNoanswer = true;
            for (int i = 1; i <= N; i++) {
                for (int j = i + broke; j <= N; j++) {
                    if (a[j] == i) {
                        isNoanswer = false;
                        break;
                    } else {
                        broke++;
                    }
                }
            }
            if (isNoanswer) {
                out.println(-1);
            } else {
                out.println(broke);
            }
        }

    }
}

