import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Scanner;
import java.util.HashMap;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author varunvats32
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DHandstand2 solver = new DHandstand2();
        solver.solve(1, in, out);
        out.close();
    }

    static class DHandstand2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();

            HashMap<DHandstand2.Pair, Integer> map = new HashMap<>();
            for (int i = 1; i <= n; i++) {
                DHandstand2.Pair p = f(i);
                Integer count = map.putIfAbsent(p, 1);
                if (count != null) {
                    map.put(p, count + 1);
                }
            }

            long ans = 0;
            for (int i = 1; i <= n; i++) {
                DHandstand2.Pair p = f(i);
                DHandstand2.Pair q = new DHandstand2.Pair(p.second, p.first);
                ans += map.getOrDefault(q, 0);
            }

            out.println(ans);
        }

        public DHandstand2.Pair f(int x) {
            int b = x % 10;
            int a = 0;

            while (x > 0) {
                a = x;
                x /= 10;
            }

            return new DHandstand2.Pair(a, b);
        }

        private static class Pair {
            public int first;
            public int second;

            public Pair(int first, int second) {
                this.first = first;
                this.second = second;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                DHandstand2.Pair pair = (DHandstand2.Pair) o;
                return first == pair.first &&
                        second == pair.second;
            }

            public int hashCode() {
                return Objects.hash(first, second);
            }

        }

    }
}

