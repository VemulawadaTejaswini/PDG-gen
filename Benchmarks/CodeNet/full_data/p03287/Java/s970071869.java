import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

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
        CandyDistribution solver = new CandyDistribution();
        solver.solve(1, in, out);
        out.close();
    }

    static class CandyDistribution {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long m = in.nextLong();

            long sum = 0;
            Map<Long, Long> mod = new HashMap<>();
            mod.put(0L, 1L);

            for (int i = 1; i <= n; i++) {
                long a = Long.parseLong(in.next());
                sum += +a;
                mod.put(sum % m, mod.getOrDefault(sum % m, 0L) + 1);
            }

            long result = 0;
            for (long key : new ArrayList<>(mod.keySet())) {
                long v = mod.get(key);
                result += v * (v - 1) / 2;
            }
            ;
            out.println(result);

        }

    }
}

