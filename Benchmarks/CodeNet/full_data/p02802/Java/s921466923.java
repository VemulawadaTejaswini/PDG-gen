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
            int m = in.nextInt();
            boolean[] b = new boolean[n]; // AC
            int[] wCount = new int[n]; // WA count
            int ac = 0;
            for (int i = 0; i < m; i++) {
                int p = in.nextInt();
                String s = in.next();
                if (b[p - 1]) { // AC
                    continue;
                }
                if (s.equals("WA")) {
                    wCount[p - 1]++;
                } else {
                    b[p - 1] = true;
                    ac++;
                }
            }
            int totalWa = 0;
            for (int i = 0; i < n; i++) {
                if (b[i]) {
                    totalWa += wCount[i];
                }
            }
            out.println(ac + " " + totalWa);
        }

    }
}

