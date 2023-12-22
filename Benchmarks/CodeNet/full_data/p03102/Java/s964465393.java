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
        ABC121_2 solver = new ABC121_2();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC121_2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int M = in.nextInt();
            int C = in.nextInt();
            int accnt = 0;
            int[] B = new int[M];
            for (int i = 0; i < M; i++) {
                B[i] = in.nextInt();
            }
            for (int i = 0; i < N; i++) {
                int ttl = 0;
                for (int b : B) {
                    int A = in.nextInt() * b;
                    ttl += A;
                }
                if ((ttl + C) > 0) {
                    accnt++;
                }
            }
            out.println(accnt);

        }

    }
}

