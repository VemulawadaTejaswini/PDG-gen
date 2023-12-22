import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
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
        DigitsMultiplication solver = new DigitsMultiplication();
        solver.solve(1, in, out);
        out.close();
    }

    static class DigitsMultiplication {
        long diff = Long.MAX_VALUE;
        long ansA;
        long ansB;

        static HashMap<Long, Long> primeFactorize(long x) {
            HashMap<Long, Long> result = new HashMap<>();
            for (long i = 2; i * i <= x; i++) {
                if (x % i != 0) {
                    continue;
                }
                long ex = 0;
                while (x % i == 0) {
                    ex++;
                    x /= i;
                }
                result.put(i, ex);
            }
            if (x != 1) {
                result.put(x, 1L);
            }
            return result;
        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long n = in.nextLong();

            HashMap<Long, Long> map = primeFactorize(n);
            List<Long> list = new ArrayList<>(map.keySet());
            List<Long> primes = new ArrayList<>();
            for (long key : list) {
                int limit = map.get(key).intValue();
                for (int i = 0; i < limit; i++) {
                    primes.add(key);
                }
            }

            dfs(primes, 0, 1, 1);

            int result = Math.max(
                    String.valueOf(ansA).length(),
                    String.valueOf(ansB).length()
            );
            out.println(result);
        }

        public void dfs(List<Long> list, int index, long a, long b) {
            if (index == list.size()) {
                if (Math.abs(a - b) < diff) {
                    diff = Math.abs(a - b);
                    ansA = a;
                    ansB = b;
                }
            } else {
                dfs(list, index + 1, a * list.get(index), b);
                dfs(list, index + 1, a, b * list.get(index));
            }
        }

    }
}

