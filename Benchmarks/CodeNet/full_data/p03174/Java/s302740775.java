import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author vdewansa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        OMatching solver = new OMatching();
        solver.solve(1, in, out);
        out.close();
    }

    static class OMatching {
        final int MOD = 1_000_000_000 + 7;

        int add(int a, int b) {
            int res = a + b;
            if (res >= MOD) {
                res -= MOD;
            }
            return res;
        }

        int setOf(int elem) {
            return 1 << (elem - 1);
        }

        boolean contains(int set, int elem) {
            return ((set >> (elem - 1)) & 1) != 0;
        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            ArrayList<HashSet<Integer>> a = new ArrayList<>();
            a.add(new HashSet<>());
            for (int i = 1; i <= N; i++) {
                HashSet<Integer> s = new HashSet<>();
                for (int j = 1; j <= N; j++) {
                    if (in.nextInt() > 0) {
                        s.add(j);
                    }
                }
                a.add(s);
            }
            int[][] ways = new int[N + 1][setOf(N + 1)];
            ways[0][0] = 1;
            for (int i = 1; i <= N; i++) {
                for (int j : a.get(i)) {
                    for (int oldS = 0; oldS < ways[i].length; oldS++) {
                        if (!contains(oldS, j)) {
                            int newS = oldS | setOf(j);
                            ways[i][newS] = add(ways[i][newS], ways[i - 1][oldS]);
                        }
                    }
                }
            }
            out.println(ways[N][setOf(N + 1) - 1]);
        }

    }
}

