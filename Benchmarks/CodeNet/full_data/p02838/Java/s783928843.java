import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Objects;
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
        XorSum solver = new XorSum();
        solver.solve(1, in, out);
        out.close();
    }

    static class XorSum {
        public static long MOD = 1_000_000_007;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
            }

            Map<Pair, Long> map = new HashMap<>();

            long result = 0;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    Pair pair = new Pair((long) i, (long) j);
                    if (!map.containsKey(pair)) {
                        map.put(pair, (a[i] ^ a[j]) % MOD);
                    }
                    result += map.get(pair);
                    result %= MOD;
                }
            }
            out.println(result);

        }

        class Pair implements Comparable<Pair> {
            public final Long first;
            public final Long second;

            Pair(Long first, Long second) {
                this.first = first;
                this.second = second;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof Pair))
                    return false;
                Pair pair = (Pair) obj;
                return pair.first.equals(first) && pair.second.equals(second);
            }

            public int hashCode() {
                return Objects.hash(first, second);
            }

            public int compareTo(Pair o) {
                int res = Long.compare(first, o.first);
                return res != 0 ? res : Long.compare(second, o.second);
            }

        }

    }
}

