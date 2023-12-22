import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

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
        CADDi_C solver = new CADDi_C();
        solver.solve(1, in, out);
        out.close();
    }

    static class CADDi_C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long n = in.nextLong();
            long p = in.nextLong();
            Map<Long, Long> prime = new HashMap<Long, Long>();

            while (p % 2 == 0) {
                if (!prime.containsKey((long) 2)) {
                    prime.put((long) 2, (long) 1);
                } else {
                    long value = prime.get((long) 2);
                    prime.put((long) 2, ++value);
                }
                p /= 2;
            }

            long i = 3;
            while (p != 1) {
                if (p % i == 0) {
                    if (!prime.containsKey(i)) {
                        prime.put(i, (long) 1);
                    } else {
                        long value = prime.get(i);
                        prime.put(i, ++value);
                    }
                    p /= i;
                } else {
                    i += 2;
                }
            }

            long ans = 1;

            for (long key : prime.keySet()) {
                if (prime.get(key) / n != 0) {
                    ans *= key * (prime.get(key) / n);
                }
            }

            out.print(ans);

        }

    }
}

