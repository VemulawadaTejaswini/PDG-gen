import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
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
        GetEverything solver = new GetEverything();
        solver.solve(1, in, out);
        out.close();
    }

    static class GetEverything {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            long[] result = new long[n];
            Arrays.fill(result, 1000000);

            long[] a = new long[m];
            List<List<Integer>> cc = new ArrayList<>();

            for (int i = 0; i < m; i++) {
                a[i] = in.nextLong();
                int b = in.nextInt();
                ArrayList<Integer> c = new ArrayList<>();
                for (int j = 0; j < b; j++) {
                    c.add(in.nextInt() - 1);
                }
                cc.add(c);
            }

            for (int i = 0; i < m; i++) {
                long cost = cost(result);
                long[] tmp = result.clone();
                List<Integer> c = cc.get(i);
                long nextCost = a[i];
                for (Integer j : c) {
                    tmp[j] = nextCost;
                }
                if (cost(tmp) < cost) {
                    result = tmp;
                }
            }
            for (long l : result) {
                if (l == 1000000) {
                    out.println(-1);
                    return;
                }
            }
            out.println(cost(result));

        }

        public long cost(long[] dst) {
            long result = 0;
            HashSet<Long> set = new HashSet<>();
            for (long l : dst) {
                if (l != 1000000 && set.contains(l)) {
                    continue;
                }
                result += l;
                set.add(l);
            }
            return result;
        }

    }
}

