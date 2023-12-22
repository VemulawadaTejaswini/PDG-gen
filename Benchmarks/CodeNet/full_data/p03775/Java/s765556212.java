import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Collections;
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
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long n = in.nextLong();
            HashMap<Long, Long> map = primeFactorize(n);
            List<Long> list = new ArrayList<>(map.keySet());
            list.sort(Collections.reverseOrder());
            long a = 1;
            long b = 1;

            for (Long key : list) {
                Long limit = map.get(key);
                for (int j = 0; j < limit; j++) {
                    if (a < b) {
                        a *= key;
                    } else {
                        b *= key;
                    }
                }
            }

            int target = Math.max(String.valueOf(a).length(), String.valueOf(b).length());
            out.println(target);
        }

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

    }
}

