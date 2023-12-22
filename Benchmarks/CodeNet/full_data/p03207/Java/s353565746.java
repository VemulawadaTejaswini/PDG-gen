import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author hakamada
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC115_b solver = new ABC115_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC115_b {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int P[] = new int[N];
            int Ph[] = new int[N];
            int Max = -1;
            int MaxIdx = 0;
            int ttl = 0;

            for (int i = 0; i < N; i++) {
                P[i] = in.nextInt();
                Ph[i] = P[i] / 2;
                if (Max < P[i]) {
                    Max = P[i];
                    MaxIdx = i;
                }

            }
            for (int i = 0; i < N; i++) {
                if (MaxIdx == i) {
                    ttl += Ph[i];
                } else {
                    ttl += P[i];
                }
            }
            out.println(ttl);
        }

    }
}

