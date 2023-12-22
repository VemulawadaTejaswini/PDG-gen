import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int A = in.nextInt();
            int B = in.nextInt();
            int Q = in.nextInt();

            long[] s = new long[A];
            for (int i = 0; i < A; i++) {
                s[i] = in.nextLong();
            }
            long[] t = new long[B];
            for (int i = 0; i < B; i++) {
                t[i] = in.nextLong();
            }

            List<Long> ans = new ArrayList<>(4);
            for (int i = 0; i < Q; i++) {
                long x = in.nextLong();

                long[] s2 = search(s, x);
                long[] t2 = search(t, x);

                ans.add(Math.abs(Math.min(s2[0], t2[0]) - x));
                ans.add(Math.abs(Math.max(s2[1], t2[1]) - x));
                ans.add(Math.abs(s2[0] - x) * 2 + Math.abs(t2[1] - x));
                ans.add(Math.abs(s2[1] - x) * 2 + Math.abs(t2[0] - x));
                ans.add(Math.abs(t2[0] - x) * 2 + Math.abs(s2[1] - x));
                ans.add(Math.abs(t2[1] - x) * 2 + Math.abs(s2[0] - x));
                ans.sort(Comparator.naturalOrder());
                out.println(ans.get(0));
                ans.clear();
            }
        }

        private long[] search(long[] xs, long v) {
            int l = 0, r = xs.length - 1;
            while (l < r) {
                if (xs[l + 1] < v) {
                    l++;
                } else if (v < xs[r - 1]) {
                    r--;
                } else {
                    break;
                }
            }
            long[] ret = {xs[l], xs[r]};
            if (v < ret[0]) {
                ret[0] = (long) -1e11;
            }
            if (ret[1] < v) {
                ret[1] = (long) 1e11;
            }
            return ret;
        }

    }
}

