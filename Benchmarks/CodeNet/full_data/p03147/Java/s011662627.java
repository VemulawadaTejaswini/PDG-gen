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
            int[] h = new int[N];
            for (int i = 0; i < N; i++) {
                h[i] = in.nextInt();
            }

            int count = 0;
            for (int l = 0; l < N; l++) {
                while (h[l] > 0) {
                    int r;
                    for (r = l; r < N; r++) {
                        if (h[r] == 0) {
                            break;
                        }
                    }
                    for (int i = l; i < r; i++) {
                        h[i]--;
                    }
                    count++;
                }
            }
            out.println(count);
        }

    }
}

