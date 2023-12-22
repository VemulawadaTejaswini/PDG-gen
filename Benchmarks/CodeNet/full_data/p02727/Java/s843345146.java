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
        SevenFiveSix solver = new SevenFiveSix();
        solver.solve(1, in, out);
        out.close();
    }

    static class SevenFiveSix {
        HashMap<Long, Long> map;
        long result = 0;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            map = new HashMap<>();

            for (int i = 2; i <= n; i++) {
                HashMap<Long, Long> p = primeFactorize(i);
                for (long key : p.keySet()) {
                    map.put(key, map.getOrDefault(key, 1L) + p.get(key));
                }
            }


            dfs(new ArrayList<>(map.keySet()), 0, 75);
            out.println(result);

        }

        public void dfs(List<Long> list, int index, int target) {

            if (list.size() == index) {
                if (target == 1) {
                    result++;
                }
                return;
            }

            int limit = map.get(list.get(index)).intValue();
            for (int i = 1; i <= limit; i++) {
                if (target % i != 0) {
                    continue;
                }
                dfs(list, index + 1, target / i);
            }
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

