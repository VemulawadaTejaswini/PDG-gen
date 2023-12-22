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
            int n = in.nextInt();

            int[] x = new int[n];

            int cnt = 0;

            for (int i = 0; i < n; i++) {
                x[i] = in.nextInt();
                cnt += x[i];
            }

            int dist = (int) Math.round((double) cnt / n);

            int power = 0;

            for (int i = 0; i < n; i++) {
                power += (x[i] - dist) * (x[i] - dist);
            }
            out.println(power);


        }

    }
}

