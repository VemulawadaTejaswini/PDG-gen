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
        ABC138_b solver = new ABC138_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC138_b {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            double Adash = 0;
            int i = 0;
            for (i = 0; i < N; i++) {
                double work = 1 / in.nextDouble();
                Adash += work;
            }
            out.println(1 / Adash);

//        int[] A = new int[N];

        }

    }
}

