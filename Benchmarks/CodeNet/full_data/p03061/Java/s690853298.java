import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Arrays;
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
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }
            int[] gcds = new int[N];
            Arrays.fill(gcds, 0);
            gcds[0] = Math.max(gcd(A[0], A[1]), gcd(A[N - 1], A[0]));
            gcds[N - 1] = Math.max(gcd(A[N - 2], A[N - 1]), gcd(A[N - 1], A[0]));
            for (int i = 1; i < N - 1; i++) {
                gcds[i] = Math.max(gcd(A[i - 1], A[i]), gcd(A[i], A[i + 1]));
            }
            int index = -1;
            int min = (int) 1e9;
            for (int i = 0; i < N; i++) {
                if (gcds[i] < min) {
                    min = gcds[i];
                    index = i;
                }
            }
            if (index >= 0) {
                System.err.println(index);
                A[index] = A[index + 1 < N ? index + 1 : 0];
            }
            int gcd = gcd(A[0], A[1]);
            for (int i = 1; i < N; i++) {
                gcd = gcd(gcd, A[i]);
            }
            out.println(gcd);
        }

        int gcd(int a, int b) {
            if (a < b) {
                a ^= b;
                b ^= a;
                a ^= b;
            }

            return b > 0 ? gcd(b, a % b) : a;
        }

    }
}

