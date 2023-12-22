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
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DSimpleKnapsack solver = new DSimpleKnapsack();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSimpleKnapsack {
        private static int n;
        private static int[] w;
        private static int[] v;
        private static final Map<DSimpleKnapsack.Key, Integer> dp = new HashMap<>();

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            dp.clear();
            n = in.nextInt();
            int wa = in.nextInt();
            w = new int[n];
            v = new int[n];
            for (int i = 0; i < n; i++) {
                w[i] = in.nextInt();
                v[i] = in.nextInt();
            }
            out.println(calc(new DSimpleKnapsack.Key(0, wa)));
            // System.out.println(dp);
        }

        private int calc(DSimpleKnapsack.Key key) {
            if (key.index == n) {
                return 0;
            } else if (dp.containsKey(key)) {
                return dp.get(key);
            }
            int ans = calc(new DSimpleKnapsack.Key(key.index + 1, key.toughness));
            int nt = key.toughness - w[key.index];
            if (nt >= 0) {
                ans = Math.max(ans, calc(new DSimpleKnapsack.Key(key.index + 1, nt)) + v[key.index]);
            }
            dp.put(key, ans);
            return ans;
        }

        private static class Key {
            int index;
            int toughness;

            public Key(int index, int toughness) {
                this.index = index;
                this.toughness = toughness;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                DSimpleKnapsack.Key key = (DSimpleKnapsack.Key) o;
                return index == key.index &&
                        toughness == key.toughness;
            }

            public int hashCode() {
                return Objects.hash(index, toughness);
            }

            public String toString() {
                return "Key(" +
                        index +
                        ", " + toughness +
                        ')';
            }

        }

    }
}

