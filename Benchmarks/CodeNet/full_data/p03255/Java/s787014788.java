import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BGarbageCollector solver = new BGarbageCollector();
        solver.solve(1, in, out);
        out.close();
    }

    static class BGarbageCollector {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long e = in.nextLong();
            long[] x = new long[n];
            for (int i = 0; i < n; i++) {
                x[i] = in.nextLong();
            }
            long ans = 0;
            int c = n;
            int d = -1;
            while (c - d > 1) {
                c--;
                //System.out.println("Case #" + c);
                int amount = 1;
                long energyReq = e * 2 + 5 * x[c];
                while (c > 0) {
                    if (e + 5 * x[c - 1] <
                            conveyEnergyRequired(amount + 1, x[c - 1])
                                    - conveyEnergyRequired(amount, x[c - 1])
                    ) {
                        break;
                    }
                    energyReq -= conveyEnergyRequired(amount, x[c - 1]);
                    energyReq += conveyEnergyRequired(amount + 1, x[c - 1]);
                    energyReq += e;
                    amount++;
                    c--;
                    //System.out.println("Picked #" + c);
                }
                if (d < c - 1) {
                    if (x[d + 1] * (2 * amount + 1) < 5 * x[d + 1] + e) {
                        energyReq += x[d + 1] * (2 * amount + 1);
                        energyReq -= e;
                        d++;
                    }
                }

                //System.out.println("Ans: " + energyReq);
                ans += energyReq;
            }
            out.println(ans);
        }

        private static long conveyEnergyRequired(int amount, long distance) {
            return distance * (amount + 1) * (amount + 1);
        }

    }
}

